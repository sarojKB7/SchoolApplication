package com.cg.spc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.Student;
import com.cg.spc.entities.StudentExamAttempt;

@Repository
public interface IStudentExamAttemptRepository extends JpaRepository<StudentExamAttempt, Integer> {
	
	
	
}
