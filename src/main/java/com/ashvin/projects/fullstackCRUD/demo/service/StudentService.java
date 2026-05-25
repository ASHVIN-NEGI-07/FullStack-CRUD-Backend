package com.ashvin.projects.fullstackCRUD.demo.service;

import com.ashvin.projects.fullstackCRUD.demo.entity.Student;
import com.ashvin.projects.fullstackCRUD.demo.repository.StudentRepository;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private  StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
        Student updatedStudent = studentRepository.findById(student.getId()).orElseThrow(()
                -> new RuntimeException("Student not found"));
        updatedStudent.setName(student.getName());
        updatedStudent.setAge(student.getAge());
        updatedStudent.setDepartment(student.getDepartment());

        return studentRepository.save(updatedStudent);
    }

    public Boolean deleteStudent(Long id) {
        if(studentRepository.existsById(id)){
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
