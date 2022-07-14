package com.cg.spc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.Student;
import com.cg.spc.entities.StudentExamAttempt;
import com.cg.spc.repository.IStudentExamAttemptRepository;

@Service
public class StudentExamAttemptService implements IStudentExamAttemptService{

	@Autowired
	IStudentExamAttemptRepository repo;
	
	@Override
	public StudentExamAttempt addStudentExamAttempt(StudentExamAttempt attempt) {
		// TODO Auto-generated method stub
		if(attempt != null)
			repo.save(attempt);
		return null;
	}

	@Override
	public StudentExamAttempt updateStudentExamAttempt(StudentExamAttempt attempt) {
		// TODO Auto-generated method stub
		if(!repo.existsById(attempt.getStudentExamAttemptId()))
			repo.save(attempt);
		return null;
	}

	@Override
	public StudentExamAttempt deleteStudentExamAttempt(StudentExamAttempt attempt) {
		// TODO Auto-generated method stub
		if(repo.existsById(attempt.getStudentExamAttemptId()))
			repo.deleteById(attempt.getStudentExamAttemptId());
		return null;
	}

	@Override
	public List<StudentExamAttempt> retrieveAllStudentExamAttemptByStudent(Student student) {
		// TODO Auto-generated method stub
		List<StudentExamAttempt> list=repo.findAll();
		return list;
	}

	@Override
	public StudentExamAttempt retrieveStudentExamAttemptById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
