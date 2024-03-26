package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_Order_Address")
public class Customer_Address {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer customer_Id;
private String customer_Name;
private String email;
private String mobile;
private String city;
private String state;
private Integer pincode;

private Integer orderId;

public Integer getCustomer_Id() {
	return customer_Id;
}

public void setCustomer_Id(Integer customer_Id) {
	this.customer_Id = customer_Id;
}

public String getCustomer_Name() {
	return customer_Name;
}

public void setCustomer_Name(String customer_Name) {
	this.customer_Name = customer_Name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public Integer getPincode() {
	return pincode;
}

public void setPincode(Integer pincode) {
	this.pincode = pincode;
}

public Integer getOrderId() {
	return orderId;
}

public void setOrderId(Integer orderId) {
	this.orderId = orderId;
}

@Override
public String toString() {
	return "Customer_Address [customer_Id=" + customer_Id + ", customer_Name=" + customer_Name + ", email=" + email
			+ ", mobile=" + mobile + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", orderId="
			+ orderId + "]";
}


}
