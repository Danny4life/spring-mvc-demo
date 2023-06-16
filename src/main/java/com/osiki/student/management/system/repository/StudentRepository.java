package com.osiki.student.management.system.repository;

import com.osiki.student.management.system.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
