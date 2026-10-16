package com.cybersoft.restfulapi.question5.service;

import com.cybersoft.restfulapi.question5.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final static List<Student> mockData = new ArrayList<>();
    private static int mockIndex = 0;

    public StudentService() {
        Student student1 = new Student();
        student1.setId(mockIndex);
        student1.setEmail("admin@gmail.com");
        student1.setFullName("Admin");

        mockData.add(student1);
        mockIndex++;
    }

    public Student findById(int id) {
        return mockData
                .stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean save(Student student) {
        if (isExisting(student)) {
            return false;
        }

        Student newStudent = new Student();

        newStudent.setId(mockIndex+1);
        newStudent.setEmail(student.getEmail());
        newStudent.setFullName(student.getFullName());

        mockData.add(newStudent);
        mockIndex++;

        return true;
    }

    public boolean isExisting(Student student) {
        return mockData
                .stream()
                .filter(stu -> stu.getEmail().equals(student.getEmail()))
                .findFirst()
                .isPresent();
    }
}
