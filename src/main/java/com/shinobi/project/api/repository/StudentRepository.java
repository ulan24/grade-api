package com.shinobi.project.api.repository;

import com.shinobi.project.api.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

}