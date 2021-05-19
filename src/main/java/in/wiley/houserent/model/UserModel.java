package in.wiley.houserent.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModel {
	
	@Id
	private String username;
	private String mobile;
	private String gender;
	private String occupation;
	private String email;
	private String password;
	private String type;
	private String address;
	
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserModel(String username, String mobile, String gender, String occupation, String email, String password,
			String type, String address) {
		super();
		this.username = username;
		this.mobile = mobile;
		this.gender = gender;
		this.occupation = occupation;
		this.email = email;
		this.password = password;
		this.type = type;
		this.address = address;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserModel [username=" + username + ", mobile=" + mobile + ", gender=" + gender + ", occupation="
				+ occupation + ", email=" + email + ", password=" + password + ", type=" + type + ", address=" + address
				+ "]";
	}
	
	

}
