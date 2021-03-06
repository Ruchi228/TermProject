package edu.sjsu.cmpe275.entities;

// Generated Nov 22, 2015 8:22:29 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.OneToOne;

/**
 * SharedProjects generated by hbm2java
 */
@Entity
@Table(name = "SHARED_PROJECTS", catalog = "CMPE275_PROJECT_MGMT_DB")
public class SharedProjects implements java.io.Serializable {

	private char acceptedFlag;
	private Project sharedProject;
	private Person sharedPerson;

	public SharedProjects() {
	}

	// Fields
	@Id
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "SHARED_PRJCT_ID")
	public Project getSharedProject() {
		return sharedProject;
	}

	public void setSharedProject(Project sharedProject) {
		this.sharedProject = sharedProject;
	}

	@Id
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "SHARED_PRSN_ID")
	public Person getSharedPerson() {
		return sharedPerson;
	}

	public void setSharedPerson(Person sharedPerson) {
		this.sharedPerson = sharedPerson;
	}

	@Column(name = "ACCEPTED_FLAG", nullable = false, length = 1)
	public char getAcceptedFlag() {
		return this.acceptedFlag;
	}

	public void setAcceptedFlag(char acceptedFlag) {
		this.acceptedFlag = acceptedFlag;
	}

}
