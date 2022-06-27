package com.codeclan.employeelab.employeeservice;

import com.codeclan.employeelab.employeeservice.models.Employee;
import com.codeclan.employeelab.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee jack = new Employee("Jack",18, 23456, "jack@email");
		employeeRepository.save(jack);
	}



}
