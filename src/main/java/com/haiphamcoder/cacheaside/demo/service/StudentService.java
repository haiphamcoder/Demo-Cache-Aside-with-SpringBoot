package com.haiphamcoder.cacheaside.demo.service;

import com.haiphamcoder.cacheaside.demo.model.Student;
import com.haiphamcoder.cacheaside.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    private Map<Long, Student> cache = new ConcurrentHashMap<>();

    public Student getStudentById(Long id) {
        if (cache.containsKey(id)) {
            Student student = cache.get(id);
            System.out.println(student);
            return student;
        }
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            cache.put(id, student);
        }
        return student;
    }
}
