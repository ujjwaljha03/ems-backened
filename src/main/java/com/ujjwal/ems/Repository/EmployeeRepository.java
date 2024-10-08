package com.ujjwal.ems.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ujjwal.ems.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> { 

}
