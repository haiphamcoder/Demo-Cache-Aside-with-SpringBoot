package com.haiphamcoder.cacheaside.demo.repository;

import com.haiphamcoder.cacheaside.demo.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
