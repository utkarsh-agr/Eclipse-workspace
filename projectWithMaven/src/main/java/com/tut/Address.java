package com.tut;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name="student_address")
public class Address {
	@Id
	@Column(name="address_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	
	@Column(length =50,name="street_name")
	private String street;
	
	@Column(length=50)
	private String city;
	
	@Column(name="is_Open")
	private boolean isOpen;
	
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	@Transient
	private double x;
	
	@Lob
	@Column(length=100000,name="city_Image")
	private byte[] image;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	

}
