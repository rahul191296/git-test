package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TrainingProposals_Table")
public class TrainingProposalEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trainingId;

	@NotNull
	@Column(name = "User_Id")
	private int userId;

	@NotNull
	@Column(name = "MentorId")
	private int mentorId;

	@NotNull
	@Column
	private String ProposalStatus;

	public int getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMentorId() {
		return mentorId;
	}

	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}

	public String getProposalStatus() {
		return ProposalStatus;
	}

	public void setProposalStatus(String proposalStatus) {
		ProposalStatus = proposalStatus;
	}

}
