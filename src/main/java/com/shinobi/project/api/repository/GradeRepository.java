package com.shinobi.project.api.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.shinobi.project.api.entity.Grade;
import org.springframework.data.repository.CrudRepository;

public interface GradeRepository extends CrudRepository<Grade, Long> {
     Optional<Grade> findByStudentIdAndCourseId(Long studentId, Long courseId);
     List<Grade> findByStudentId(Long studentId);
     List<Grade> findByCourseId(Long courseId);
     @Transactional
     void deleteByStudentIdAndCourseId(Long studentId, Long courseId);

}