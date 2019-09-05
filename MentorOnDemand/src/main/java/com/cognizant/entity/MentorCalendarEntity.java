package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "MentorCalendar_Table")
public class MentorCalendarEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mentorId;

	@NotNull
	@Column(name = "Technology_Name")
	private String technologyName;

	@NotNull
	@Column(name = "Training_Slots")
	private String trainingSlots;

	@NotNull
	@Column(name = "Slot_Status")
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
