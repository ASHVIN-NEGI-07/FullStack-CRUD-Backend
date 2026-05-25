package com.ashvin.projects.fullstackCRUD.demo.controller;

import com.ashvin.projects.fullstackCRUD.demo.entity.Student;
import com.ashvin.projects.fullstackCRUD.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/getStudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public Boolean deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }
}
