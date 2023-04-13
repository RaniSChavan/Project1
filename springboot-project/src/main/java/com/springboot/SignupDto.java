package com.springboot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SignupDto {
	private String fname;
	private String lname;
	@Id
	private String gmail;
	private long phnumber;
	private String pwd;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public long getPhnumber() {
		return phnumber;
	}

	public void setPhnumber(long phnumber) {
		this.phnumber = phnumber;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
