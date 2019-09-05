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
@Table(name = "Mentors_Table")
public class MentorEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mentorId;

	@NotNull
	@Column(name = "Email")
	private String email;

	@NotNull
	@Column(name = "Password")
	private String password;

	@NotNull
	@Column(name = "First_Name")
	private String firstName;

	@NotNull
	@Column(name = "Last_Name")
	private String lastName;

	@NotNull
	@Column(name = "Contact_No")
	private String contactNo;
	
	@NotNull
	@Column(name = "Timing_Slot")
	private String timingSlot;


	@NotNull
	@Column(name = "Experience")
	private String experience;

	@NotNull
	@Column(name = "Technology")
	private String technology;

	@NotNull
	@Column(name = "Linked_Url")
	private String linkedUrl;

	public MentorEntity() {

	}

	public MentorEntity(int mentorId, String password) {
		super();
		this.mentorId = mentorId;
		this.password = password;
	}

	public int getMentorId() {
		return mentorId;
	}

	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getLinkedUrl() {
		return linkedUrl;
	}

	public void setLinkedUrl(String linkedUrl) {
		this.linkedUrl = linkedUrl;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getTechnology() {
		return technology;
	}

	public String getTimingSlot() {
		return timingSlot;
	}

	public void setTimingSlot(String timingSlot) {
		this.timingSlot = timingSlot;
	}
	
	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "MentorEntity [mentorId=" + mentorId + ", eMail=" + email + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", contactNo=" + contactNo + ", experience=" + experience
				+ ", technology=" + technology + ", linkedUrl=" + linkedUrl + "]";
	}

}
