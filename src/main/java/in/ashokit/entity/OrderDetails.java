package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderDetails {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer orderId;
private String item;
private Integer quantity;
private String payment_mode;
private Double amount;
private String  status;
public Integer getOrderId() {
	return orderId;
}
public void setOrderId(Integer orderId) {
	this.orderId = orderId;
}
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
public Integer getQuantity() {
	return quantity;
}
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}
public String getPayment_mode() {
	return payment_mode;
}
public void setPayment_mode(String payment_mode) {
	this.payment_mode = payment_mode;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "OrderDetails (orderId=" + orderId + ", item=" + item + ", quantity=" + quantity + ", payment_mode="
			+ payment_mode + ", amount=" + amount + ", status=" + status + ")";
}


}
