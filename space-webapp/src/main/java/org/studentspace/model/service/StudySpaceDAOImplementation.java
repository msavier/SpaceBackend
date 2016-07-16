package org.studentspace.model.service;

import java.util.List;


import org.studentspace.db.model.HibernateGenericDao;
import org.studentspace.model.entity.StudySpace;

public class StudySpaceDAOImplementation extends HibernateGenericDao implements StudySpaceDAO{

	public StudySpace getStudySpace(int id) {
		return (StudySpace)super.find(StudySpace.class, id);
	}

	public List<StudySpace> findStudySpace() {
		return  (List<StudySpace>)super.findAll(StudySpace.class);
	}

	public StudySpace createStudySpace(StudySpace ss) {
		StudySpace value = (StudySpace)super.create(ss);
		return value;
	}

	public StudySpace updateStudySpace(StudySpace ss) {
		StudySpace value = (StudySpace)super.update(ss);
		return value;
	}

	public StudySpace removeStudySpace(StudySpace ss) {
		StudySpace value = (StudySpace)super.delete(ss);
		return value;
	}

}