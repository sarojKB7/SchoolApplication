package com.cg.spc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cg.spc.entities.*;
import com.cg.spc.service.ExamServiceImpn;
import com.cg.spc.service.IExamService;

@RestController
@RequestMapping("/exam")
public class ExamController {

	@Autowired
	private ExamServiceImpn examservice;
	
	@PostMapping("/add")
	public ResponseEntity<?> addexam(@RequestBody Exam exam){
		exam=examservice.addExam(exam);
		if(exam!=null){
			return new ResponseEntity<Exam>(exam,HttpStatus.OK);
		}
		return null;
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?>removeExam(@PathVariable("id")int examid){
		Exam e=examservice.removeExam(examid);
		if(e!=null){
			return new ResponseEntity <Exam>(e,HttpStatus.OK);
		}
		return null;
	}
	@GetMapping("/viewexam/{id}")
	public ResponseEntity<?> viewexam(@PathVariable("id")int examid){
		Exam e=examservice.viewExam(examid);
		if(e!=null){
		return new ResponseEntity<Exam>(e,HttpStatus.OK);
		}
		return null;
	}
	
	@GetMapping("/viewexamlist")
	public ResponseEntity<?> viewexamlist(){
		List<Exam>examlist=examservice.viewExamList();
		if(examlist!=null){
			return new ResponseEntity<List<Exam>>(examlist,HttpStatus.OK);
		}
		
			return null;
		
	}
	@PutMapping("/update")
	public ResponseEntity<?> updateexam(@RequestBody Exam exam){
		exam=examservice.updateExam(exam);
		if(exam!=null){
		return new ResponseEntity<Exam>(exam,HttpStatus.OK);
		}
		return null;
	}
	
}
