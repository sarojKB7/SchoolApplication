package com.cg.spc.entities;

import javax.persistence.*;


@Entity
@Table(name="subject")
public class Subject {
	
	@Id
	@GeneratedValue(generator="subject_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="subject_sql", sequenceName="student_id_seq",allocationSize=1)
	private int subjectId;
	
	@Column(length=30)
	private String title;
	
	

	public int getSubjectId() {
		return subjectId;
	}



	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public Subject(int subjectId, String title) {
		super();
		this.subjectId = subjectId;
		this.title = title;
	}
	
	
	
}
