package com.xworkz.weapon.dto;

public class BulletDTO {

	private int id;
	private String gunName;
	private int noOfBullets;
	private String type;
	public BulletDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGunName() {
		return gunName;
	}
	public void setGunName(String gunName) {
		this.gunName = gunName;
	}
	public int getNoOfBullets() {
		return noOfBullets;
	}
	public void setNoOfBullets(int noOfBullets) {
		this.noOfBullets = noOfBullets;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "BulletDTO [id=" + id + ", gunName=" + gunName + ", noOfBullets=" + noOfBullets + ", type=" + type + "]";
	}


}
