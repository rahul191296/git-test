package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Payments_Table")
public class PaymentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;

	@NotNull
	@Column(name = "Training_Id")
	private int trainingId;

	@NotNull
	@Column(name = "Mentor_Id")
	private int mentorId;

	@NotNull
	@Column(name = "Payment_Status")
	private String paymentStatus;

	public int getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}

	public int getMentorId() {
		return mentorId;
	}

	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}

	public PaymentEntity(int paymentId, int trainingId, int mentorId, String paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.trainingId = trainingId;
		this.mentorId = mentorId;
		this.paymentStatus = paymentStatus;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}
