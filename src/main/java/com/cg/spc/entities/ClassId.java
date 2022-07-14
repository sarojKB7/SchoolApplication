package com.cg.spc.entities;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="classId")
public class ClassId {
	
	@Id
	@GeneratedValue(generator="class_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="class_sql", sequenceName="class_id_seq",allocationSize=1)
	private String classId;
	
	@Column(length=30)
	private int grade;
	
	@Column(length=30)
	private char division;
	
	//private Teacher classTeacher;
	//private List<Teacher> subjectTeachers;
	
	
	
	
	
	
	public ClassId(String classId, int grade, char division, Teacher classTeacher, List<Teacher> subjectTeachers) {
		super();
		this.classId = classId;
		this.grade = grade;
		this.division = division;
		//this.classTeacher = classTeacher;
		//this.subjectTeachers = subjectTeachers;
	}






	public String getClassId() {
		return classId;
	}






	public void setClassId(String classId) {
		this.classId = classId;
	}






	public int getGrade() {
		return grade;
	}






	public void setGrade(int grade) {
		this.grade = grade;
	}






	public char getDivision() {
		return division;
	}






	public void setDivision(char division) {
		this.division = division;
	}






	/*public Teacher getClassTeacher() {
		return classTeacher;
	}






	public void setClassTeacher(Teacher classTeacher) {
		this.classTeacher = classTeacher;
	}






	public List<Teacher> getSubjectTeachers() {
		return subjectTeachers;
	}






	public void setSubjectTeachers(List<Teacher> subjectTeachers) {
		this.subjectTeachers = subjectTeachers;
	}
*/
	
	
	
}
