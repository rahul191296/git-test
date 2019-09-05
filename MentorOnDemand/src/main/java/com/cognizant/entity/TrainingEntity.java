package com.cognizant.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Trainings_Table")
public class TrainingEntity implements Serializable {

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
	@Column(name = "Fees")
	private int fees;

	@NotNull
	@Column(name = "Rating")
	private int rating;

	@NotNull
	@Column(name = "Status")
	private String status;

	@NotNull
	@Column(name = "Commission")
	private double commission;

	@NotNull
	@Column(name = "Start_Date")
	private String startDate;

	@NotNull
	@Column(name = "Last_Date")
	private String lastDate;

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

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getLastDate() {
		return lastDate;
	}

	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}

	@Override
	public String toString() {
		return "Training [trainingId=" + trainingId + ", userId=" + userId + ", mentorId=" + mentorId + ", fees=" + fees
				+ ", rating=" + rating + ", status=" + status + ", commission=" + commission + ", startDate="
				+ startDate + ", lastDate=" + lastDate + "]";
	}

}
