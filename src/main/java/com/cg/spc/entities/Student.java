package com.cg.spc.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(generator="student_seq",strategy=GenerationType.SEQUENCE)
	@ SequenceGenerator(name="student_sql", sequenceName="student_id_seq",allocationSize=1)
	private int userId;
	
	@Column(length=30)
	private LocalDate dateOfBirth;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "address_id")
//	private ClassId currentClass;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "subjects")
	private List<Subject> subjects=new ArrayList<Subject>();
	
	@Column(length=30)
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
	private Address address;
	
	//private ClassDiary classDiary;
	
	@Column(length=30)
	private String emailId;
	
	@Column(length=30)
	private String mobileNumber;

	public Student(int addressId, int userId, LocalDate dateOfBirth, ClassId currentClass, List<Subject> subjects,
			String name, Address address, String emailId, String mobileNumber) {
		super();
	
		this.userId = userId;
		this.dateOfBirth = dateOfBirth;
//		this.currentClass = currentClass;
		this.subjects = subjects;
		this.name = name;
		this.address = address;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}

	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

//	public ClassId getCurrentClass() {
//		return currentClass;
//	}
//
//	public void setCurrentClass(ClassId currentClass) {
//		this.currentClass = currentClass;
//	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	
	
	
	
	
}
