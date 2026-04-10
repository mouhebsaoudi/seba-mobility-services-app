package tum.seba.mobilityservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.stereotype.Service;

import tum.seba.mobilityservices.entity.Employee;
import tum.seba.mobilityservices.repository.EmployeeRepository;

import java.text.MessageFormat;

@Service
public class EmployeeService implements UserDetailsService {



	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private Argon2PasswordEncoder argon2PasswordEncoder;

	public Employee save(Employee newEmployee) {
		newEmployee.setPassword(argon2PasswordEncoder.encode(newEmployee.getPassword()));
		return employeeRepository.save(newEmployee);
	}

	public Iterable<Employee> findAll() {
		return employeeRepository.findAll();
	}

	public Employee findById(int employeeId) {
		return employeeRepository.findById(employeeId).orElse(null);
	}

	public void deleteById(int employeeId) {
		try {
			employeeRepository.deleteById(employeeId);
		}
		catch (Exception e) {
			System.err.println("Unable to delete Employee with ID: " + employeeId);
		}
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return employeeRepository.findByUsername(username).orElseThrow(() ->
				new UsernameNotFoundException(MessageFormat.format("User with username {0} cannot be found.", username)));
	}
}
