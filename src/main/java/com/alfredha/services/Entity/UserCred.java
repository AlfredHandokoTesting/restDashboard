package com.alfredha.services.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class UserCred {
	@Id
	@GeneratedValue
	private int userCredID;
	@Column
	private String userID;
	@Column
	private String userPass;
	
	@Override
	public String toString() {
		return "UserCred [userCredID=" + userCredID + ", userID=" + userID + ", userPass=" + userPass + "]";
	}
	
	public int getUserCredID() {
		return userCredID;
	}
	public void setUserCredID(int userCredID) {
		this.userCredID = userCredID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
}
