package com.shinobi.project.api.service;

import java.util.List;
import java.util.Set;

import com.shinobi.project.api.entity.Course;
import com.shinobi.project.api.entity.Student;

public interface StudentService {
    Student getStudent(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getStudents();
    Set<Course> getEnrolledCourses(Long id);
}