package org.studentspace.model.service;


	import java.util.List;

	import org.studentspace.model.entity.StudySpace;

	public interface StudySpaceDAO{
		public StudySpace getStudySpace(int id);	
		public List<StudySpace> findStudySpace();
		public StudySpace createStudySpace (StudySpace ss);
		public StudySpace updateStudySpace(StudySpace ss);
		public StudySpace removeStudySpace(StudySpace ss);
		

	
}
