package org.studentspace.model.entity;

import java.io.Serializable;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;




/**
 * The persistent class for the class database table.
 * 
 */
@Entity
@Table(name="class")
@NamedQuery(name="Class.findAll", query="SELECT c FROM Class c")
public class Class implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String code;

	private String name;

	//bi-directional many-to-one association to Department
	@ManyToOne
	private Department department;

	//bi-directional many-to-one association to StudySpace
	@OneToMany(mappedBy="clazz")
	private List<StudySpace> studySpaces;

	public Class() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public StudySpace addStudySpace(StudySpace studySpace) {
		getStudySpaces().add(studySpace);
		studySpace.setClazz(this);

		return studySpace;
	}

	public StudySpace removeStudySpace(StudySpace studySpace) {
		getStudySpaces().remove(studySpace);
		studySpace.setClazz(null);

		return studySpace;
	}

}