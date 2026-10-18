package com.cybersoft.restfulapi.question8.controller;

import com.cybersoft.restfulapi.question8.model.Employee;
import com.cybersoft.restfulapi.question8.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public Employee getEmployeeByID(@PathVariable String id) {
        int idNumber = Integer.parseInt(id);
        return employeeService.findById(idNumber);
    }
}
