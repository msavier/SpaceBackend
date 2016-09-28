package org.studentspace.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the university database table.
 * 
 */
@Entity
@Table(name="university")
@NamedQuery(name="University.findAll", query="SELECT u FROM University u")
public class University implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="email_domain")
	private String emailDomain;

	private String name;

	/*
	//bi-directional many-to-one association to Department
	@OneToMany(mappedBy="university")
	private List<Department> departments;
	*/

	public University() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailDomain() {
		return this.emailDomain;
	}

	public void setEmailDomain(String emailDomain) {
		this.emailDomain = emailDomain;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	public List<Department> getDepartments() {
		return this.departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	
	public Department addDepartment(Department department) {
		getDepartments().add(department);
		department.setUniversity(this);

		return department;
	}

	public Department removeDepartment(Department department) {
		getDepartments().remove(department);
		department.setUniversity(null);

		return department;
	}
	*/

}
