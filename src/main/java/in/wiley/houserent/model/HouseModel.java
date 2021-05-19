package in.wiley.houserent.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HouseModel {

	@Id
	private String regNo;
	private String name;
	private String description;
	private String available;
	private String imageUrl;
	private String location;
	private int rent;
	private String type;
	private String furnished;
	private String address;
	private String user;
	 
	public HouseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	public HouseModel(String regNo, String name, String description, String available, String imageUrl, String location,
			int rent, String type, String furnished, String address, String user) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.description = description;
		this.available = available;
		this.imageUrl = imageUrl;
		this.location = location;
		this.rent = rent;
		this.type = type;
		this.furnished = furnished;
		this.address = address;
		this.user = user;
	}
	 
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFurnished() {
		return furnished;
	}
	public void setFurnished(String furnished) {
		this.furnished = furnished;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "HouseModel [regNo=" + regNo + ", name=" + name + ", description=" + description + ", available="
				+ available + ", imageUrl=" + imageUrl + ", location=" + location + ", rent=" + rent + ", type=" + type
				+ ", furnished=" + furnished + ", address=" + address + ", user=" + user + "]";
	}
	
	
	
	
}
