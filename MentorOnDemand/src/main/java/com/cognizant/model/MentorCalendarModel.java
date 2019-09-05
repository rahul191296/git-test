package com.cognizant.model;


public class MentorCalendarModel {

	
	private int mentorId;
	

	private String technologyName;

	private String trainingSlots;

	private String slotStatus;

	public int getMentorId() {
		return mentorId;
	}

	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}

	public String getTrainingSlots() {
		return trainingSlots;
	}

	public void setTrainingSlots(String trainingSlots) {
		this.trainingSlots = trainingSlots;
	}

	public String getSlotStatus() {
		return slotStatus;
	}

	public void setSlotStatus(String slotStatus) {
		this.slotStatus = slotStatus;
	}

}
