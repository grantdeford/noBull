package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//This tells Spring to use hibernate and map this class to our database column
@Table(name="person")//This tells hibernate the name of the table in our database

public class Person {
	
	@Id//Tells hibernate what the primary key is
	@Column(name="email")//Tells hibernate which column this variable maps to
	private String email;
	
	@Column(name="username")
	private String username;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="profile_pic")
	private String profilePic;
	
	@Column(name="grade")
	private String grade;
	
	@Column(name="homeroom")
	private String homeroom;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@Column(name="post")
	private String post;
	
	@Column(name="badge_img")
	private String badge_img;
	
	@Column(name="badgeName")
	private String badgeName;
	
	@Column(name="points")
	private String points;
	
	@Column(name="role")
	private String role;
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHomeroom() {
		return homeroom;
	}

	public void setHomeroom(String homeroom) {
		this.homeroom = homeroom;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getBadge_img() {
		return badge_img;
	}

	public void setBadge_img(String badge_img) {
		this.badge_img = badge_img;
	}

	public String getBadgeName() {
		return badgeName;
	}

	public void setBadgeName(String badgeName) {
		this.badgeName = badgeName;
	}

	
	
	
	
}
