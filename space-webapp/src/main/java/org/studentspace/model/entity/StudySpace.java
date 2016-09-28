package org.studentspace.model.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the study_space database table.
 * 
 */
@Entity
@Table(name="study_space")
@NamedQuery(name="StudySpace.findAll", query="SELECT s FROM StudySpace s")
public class StudySpace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="ingroup_description")
	private String ingroupDescription;

	private String location;

	@Column(name="other_class")
	private String otherClass;

	@Column(name="other_faculty")
	private String otherFaculty;

	@Lob
	private byte[] picture;

	@Column(name="public_description")
	private String publicDescription;

	private String title;

	//bi-directional many-to-one association to Class
	@ManyToOne
	@JoinColumn(name="class_id")
	private Class clazz;

	//bi-directional many-to-one association to Faculty
	@ManyToOne
	private Faculty faculty;

	public StudySpace() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIngroupDescription() {
		return this.ingroupDescription;
	}

	public void setIngroupDescription(String ingroupDescription) {
		this.ingroupDescription = ingroupDescription;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOtherClass() {
		return this.otherClass;
	}

	public void setOtherClass(String otherClass) {
		this.otherClass = otherClass;
	}

	public String getOtherFaculty() {
		return this.otherFaculty;
	}

	public void setOtherFaculty(String otherFaculty) {
		this.otherFaculty = otherFaculty;
	}

	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getPublicDescription() {
		return this.publicDescription;
	}

	public void setPublicDescription(String publicDescription) {
		this.publicDescription = publicDescription;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Class getClazz() {
		return this.clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	public Faculty getFaculty() {
		return this.faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

}