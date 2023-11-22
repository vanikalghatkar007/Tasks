package com.vani.service;

import java.util.List;

import com.vani.model.Student;
public interface StudentService {
 Student addStudent(Student student);
 List<Student> getAllStudents();
}

