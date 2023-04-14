package com.shinobi.project.api.repository;

import com.shinobi.project.api.entity.Course;
import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course, Long> {

}