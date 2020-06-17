package com.siva.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
