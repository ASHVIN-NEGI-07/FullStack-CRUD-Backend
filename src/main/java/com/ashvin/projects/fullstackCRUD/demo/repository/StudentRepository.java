package com.ashvin.projects.fullstackCRUD.demo.repository;

import com.ashvin.projects.fullstackCRUD.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
