package org.studentspace.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import org.studentspace.model.entity.*;


/**
 * The persistent class for the university database table.
 * 
 */
@Entity
@Table(name="department")
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="email_domain")
	private String emailDomain;
    private University uni;
	private String name;

	/*
	//bi-directional many-to-one association to Department
	@OneToMany(mappedBy="university")
	*/
	
	//private List<Department> departments;
	public Department() {
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

	/*public List<Department> getDepartments() {
		return this.departments;
	}
   
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	*/
	  public University getUniversity() {
	        return this.uni;
	    }

	    public void setUniversity(University university) {
	        this.uni = university;
	    }
	
 /*
	public Department addDepartment(Department department) {
		getDepartments().add(department);
		department.setDepartments(this);

		return department;
	}

	public Department removeDepartment(Department department) {
		getDepartments().remove(department);
		department.setUniversity(null);

		return department;
	}
*/
}
