package com.cognizant.model;

public class TrainingProposalModel {
	
	private int trainingId;

	private int userId;

	private int mentorId;

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
