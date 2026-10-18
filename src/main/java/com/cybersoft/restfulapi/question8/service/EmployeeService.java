package com.cybersoft.restfulapi.question8.service;

import com.cybersoft.restfulapi.question8.exception.ResourceNotFound;
import com.cybersoft.restfulapi.question8.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private static final List<Employee> mockData = new ArrayList<>();

    public EmployeeService() {
        Employee employee = new Employee();

        employee.setId(0);
        employee.setEmail("ngkhang@gmail.com");
        employee.setName("Nguyen Khang");

        mockData.add(employee);
    }

    public Employee findById(int id) {
        Employee employee = mockData.stream().filter(emp -> emp.getId() == id).findFirst().orElse(null);

        if (employee == null) {
            throw new ResourceNotFound("Employee not found");
        }
        return employee;
    }
}
