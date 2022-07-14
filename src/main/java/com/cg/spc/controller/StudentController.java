package com.cg.spc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.Student;
import com.cg.spc.service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService serv;
	
	@PostMapping("/add")
	public  Student addStudent(@RequestBody Student student) {
		
		return serv.addStudent(student);
	}
	
	@GetMapping("/viewAll")
	public  List<Student> viewStudent() {
		
		return serv.retrieveAllStudents();
	}
	

}
