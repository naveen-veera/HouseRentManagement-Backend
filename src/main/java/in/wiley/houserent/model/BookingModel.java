package in.wiley.houserent.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BookingModel {
	
	@Id
	@GeneratedValue
	private long id;
	private String bookedUser;
	private String houseId;
	private String houseOwner;
	private String approved;
	
	public BookingModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingModel(long id, String bookedUser, String houseId, String houseOwner, String approved) {
		super();
		this.id = id;
		this.bookedUser = bookedUser;
		this.houseId = houseId;
		this.houseOwner = houseOwner;
		this.approved = approved;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookedUser() {
		return bookedUser;
	}

	public void setBookedUser(String bookedUser) {
		this.bookedUser = bookedUser;
	}

	public String getHouseId() {
		return houseId;
	}

	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}

	public String getHouseOwner() {
		return houseOwner;
	}

	public void setHouseOwner(String houseOwner) {
		this.houseOwner = houseOwner;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	@Override
	public String toString() {
		return "BookingModel [id=" + id + ", bookedUser=" + bookedUser + ", houseId=" + houseId + ", houseOwner="
				+ houseOwner + ", approved=" + approved + "]";
	}
	
	
}
