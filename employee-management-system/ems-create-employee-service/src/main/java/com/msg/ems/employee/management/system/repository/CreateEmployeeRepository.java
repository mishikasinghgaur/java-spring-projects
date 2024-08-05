package com.msg.ems.employee.management.system.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CreateEmployeeRepository extends MongoRepository {
    public void addEmployee();
}
