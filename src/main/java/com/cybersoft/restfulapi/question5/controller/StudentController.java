package com.cybersoft.restfulapi.question5.controller;

import com.cybersoft.restfulapi.question5.model.Student;
import com.cybersoft.restfulapi.question5.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id) {
        try {
            int idNumber = Integer.parseInt(id);
            return studentService.findById(idNumber);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("ID must be number");
        }
    }

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        boolean isSuccess = studentService.save(student);
        return isSuccess ? "Student added successfully" : "Student already exists";
    }
}
