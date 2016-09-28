package org.studentspace.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the faculty database table.
 * 
 */
@Entity
@Table(name="faculty")
@NamedQuery(name="Faculty.findAll", query="SELECT f FROM Faculty f")
public class Faculty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="email_id")
	private String emailId;

	private int fax;

	private String location;

	@Column(name="mail_code")
	private int mailCode;

	private String name;

	private int phone;

	private String title;

	//bi-directional many-to-one association to Department
	@ManyToOne
	private Department department;

	//bi-directional many-to-one association to StudySpace
	@OneToMany(mappedBy="faculty")
	private List<StudySpace> studySpaces;

	public Faculty() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getFax() {
		return this.fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMailCode() {
		return this.mailCode;
	}

	public void setMailCode(int mailCode) {
		this.mailCode = mailCode;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<StudySpace> getStudySpaces() {
		return this.studySpaces;
	}

	public void setStudySpaces(List<StudySpace> studySpaces) {
		this.studySpaces = studySpaces;
	}

	/*
	public StudySpace addStudySpace(StudySpace studySpace) {
		getStudySpaces().add(studySpace);
		studySpace.setFaculty(this);

		return studySpace;
	}

	public StudySpace removeStudySpace(StudySpace studySpace) {
		getStudySpaces().remove(studySpace);
		studySpace.setFaculty(null);

		return studySpace;
	}
 */
}