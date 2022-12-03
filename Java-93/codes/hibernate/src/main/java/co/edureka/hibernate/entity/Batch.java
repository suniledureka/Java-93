package co.edureka.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Batch {
	@Id
	@GeneratedValue
	private Integer batchId;
	private String course;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "facultyId")	
	private Faculty faculty;

	public Batch(String course, Faculty faculty) {
		super();
		this.course = course;
		this.faculty = faculty;
	}

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

}
