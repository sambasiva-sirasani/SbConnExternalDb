package com.siva.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.siva.model.Employee;

@Component
public class Test implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepo repo;
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Employee(101, "siva", "Hyd", 101.2));
		repo.save(new Employee(102, "sai", "Gnt", 122.2));
		System.out.println("Done");
		
		
	}

}
