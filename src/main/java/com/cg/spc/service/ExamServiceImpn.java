package com.cg.spc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.Exam;
import com.cg.spc.repository.IExamRepository;
import com.cg.spc.service.*;



@Service
public class ExamServiceImpn implements IExamService{

	@Autowired
	private IExamRepository examservicerepo;
	
	public Exam addExam(Exam exam)  {
		if(!examservicerepo.existsById(exam.getExamId())){
		examservicerepo.save(exam);
		return exam;
		}
		return null;
	}

	public Exam updateExam(Exam exam){
		if(examservicerepo.existsById(exam.getExamId())){
			examservicerepo.save(exam);
			return exam;
		}
		return null;
		
	}
	
	public Exam removeExam(int examid){
		if(examservicerepo.existsById(examid)){
			Exam exam=examservicerepo.findById(examid).get();
			examservicerepo.delete(exam);
			return exam;
		}
		return null;
	}

	public List<Exam> viewExamList(){
		List<Exam>al=examservicerepo.findAll();
		if(al.size()>0){
			return al;
		}
		return null;
	}
	
	public Exam viewExam(int examid){
		if(examservicerepo.existsById(examid)){
			Exam exam=examservicerepo.findById(examid).get();
			return exam;
		}
		return null;
	}

	
}
