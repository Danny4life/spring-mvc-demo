package com.osiki.student.management.system.service.impl;

import com.osiki.student.management.system.entity.StudentEntity;
import com.osiki.student.management.system.repository.StudentRepository;
import com.osiki.student.management.system.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }


    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}
