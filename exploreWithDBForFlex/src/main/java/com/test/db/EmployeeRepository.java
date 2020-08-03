package com.test.db;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;



public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
