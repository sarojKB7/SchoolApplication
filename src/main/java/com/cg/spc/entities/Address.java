package com.cg.spc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name= "Teacher")
#Table(name="Teacher_Table")
public class Teacher {
	@Id
	private int teacherId;
	

}
