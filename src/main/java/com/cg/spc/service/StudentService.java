package com.cg.spc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.Student;
import com.cg.spc.repository.IStudentRepository;

@Service
public class StudentService implements IStudentService{

	@Autowired
	IStudentRepository repo;
	
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		if(student!=null)
			repo.save(student);
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		if(repo.existsById(student.getUserId())) {
			repo.save(student);
			return student;}
			
		return null;
	}

	@Override
	public Student deleteStudent(Student student) {
		// TODO Auto-generated method stub
		if(repo.existsById(student.getUserId())) {
			repo.deleteById(student.getUserId());
		}
		return null;
	}

	@Override
	public List<Student> retrieveAllStudents() {
		// TODO Auto-generated method stub
		List<Student> list=repo.findAll();
		return list;
	}

	@Override
	public Student retrieveStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
