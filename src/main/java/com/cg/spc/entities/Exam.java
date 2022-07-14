package com.cg.spc.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Exam_Table")
public class Exam {

	@Id
	private int examId;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate DateOfExam;
	@Column(name="Max_Marks")
	private int MaxMarks;
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam(int examId, LocalDate dateOfExam, int maxMarks) {
		super();
		this.examId = examId;
		DateOfExam = dateOfExam;
		MaxMarks = maxMarks;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public LocalDate getDateOfExam() {
		return DateOfExam;
	}
	public void setDateOfExam(LocalDate dateOfExam) {
		DateOfExam = dateOfExam;
	}
	public int getMaxMarks() {
		return MaxMarks;
	}
	public void setMaxMarks(int maxMarks) {
		MaxMarks = maxMarks;
	}
	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", DateOfExam=" + DateOfExam + ", MaxMarks=" + MaxMarks + "]";
	}
	
	
}
