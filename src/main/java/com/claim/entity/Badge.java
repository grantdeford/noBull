package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Badge")
public class Badge {
	
	@Id//primary key reference
	@Column(name="p_id")//Table creation
	private int p_id;
	
	@Column(name="points")
	private int points;
	//@Column(name="pointsEarned")//Do I need points earned from person DB I will be using a query in the repository
	//private String pointsEarned;
	
	//@Column(name="email")
		//private String email;
		//in the repository I will create a query to get the information in repository and place relate to person object NOT email
	
	@Column(name="badgeName")
	private String badgeName;
	
	@Column(name="swag")
	private String swag;
	
	@Column(name="badge_img")
	private String badge_img;

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	/*public String getPointsEarned() {
		return pointsEarned;
	}*/

	/*public void setPointsEarned(String pointsEarned) {
		this.pointsEarned = pointsEarned;
	}*/

	public String getBadgeName() {
		return badgeName;
	}

	public void setBadgeName(String badgeName) {
		this.badgeName = badgeName;
	}

	public String getSwag() {
		return swag;
	}

	public void setSwag(String swag) {
		this.swag = swag;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getBadge_img() {
		return badge_img;
	}

	public void setBadge_img(String badge_img) {
		this.badge_img = badge_img;
	}
	
}
