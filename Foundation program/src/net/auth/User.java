package net.auth;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class User {
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "doorNo", column = @Column(name = "PERSONAL_DOOR_NO")),
		@AttributeOverride(name = "street", column = @Column(name = "PERSONAL_STREET_NO")),
		@AttributeOverride(name = "location", column = @Column(name = "PERSONAL_LOCATION")),
		@AttributeOverride(name = "city", column = @Column(name = "PERSONAL_CITY")),
		@AttributeOverride(name = "state", column = @Column(name = "PERSONAL_STATE")),
		@AttributeOverride(name = "pincode", column = @Column(name = "PERSONAL_PINCODE"))
	})
	private Address personalAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "doorNo", column = @Column(name = "CMPY_DOOR_NO")),
		@AttributeOverride(name = "street", column = @Column(name = "CMPY_STREET_NO")),
		@AttributeOverride(name = "location", column = @Column(name = "CMPY_LOCATION")),
		@AttributeOverride(name = "city", column = @Column(name = "CMPY_CITY")),
		@AttributeOverride(name = "state", column = @Column(name = "CMPY_STATE")),
		@AttributeOverride(name = "pincode", column = @Column(name = "CMPY_PINCODE"))
	})
	
	private Address companyAddress;
	
	@Id
	@Column(name = "User_ID")
	private int userId;
	@Column(name = "User_Name")
	private String UserName;
	@Column(name = "Phone")
	private long PhoneNo;
	@Column(name = "EmailID")
	private String emailId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public long getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setPersonalAddress(Address personalAddress2) {
		// TODO Auto-generated method stub
		
	}
	public void setCompanyAddress(Address companyAddress2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
