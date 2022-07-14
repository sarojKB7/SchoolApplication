package com.cg.spc.entities;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="exam_attempt")
public class StudentExamAttempt {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentExamAttemptId;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Student student;
	
//	@OneToOne(cascade=CascadeType.ALL)
//	private Exam exam;
	
	@Column(name="attempt")
	private boolean attempted;
	
	@Column(length=30)
	private int marksObtained;

	public StudentExamAttempt(int studentExamAttemptId, Student studen, boolean attempted,
			int marksObtained) {
		super();
		this.studentExamAttemptId = studentExamAttemptId;
		this.student = student;
		//this.exam = exam;
		this.attempted = attempted;
		this.marksObtained = marksObtained;
	}

	public int getStudentExamAttemptId() {
		return studentExamAttemptId;
	}

	public void setStudentExamAttemptId(int studentExamAttemptId) {
		this.studentExamAttemptId = studentExamAttemptId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

//	public Exam getExam() {
//		return exam;
//	}
//
//	public void setExam(Exam exam) {
//		this.exam = exam;
//	}

	public boolean isAttempted() {
		return attempted;
	}

	public void setAttempted(boolean attempted) {
		this.attempted = attempted;
	}

	public int getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}
	
	
}
