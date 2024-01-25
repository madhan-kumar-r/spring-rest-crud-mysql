package com.revature.jpa.springrestjpa.repos;

import com.revature.jpa.springrestjpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
