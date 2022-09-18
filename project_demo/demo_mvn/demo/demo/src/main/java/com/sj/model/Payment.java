package com.sj.model;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {
	@Id
	private int PaymentId;
	private String PaymentMethod;
	private Double PaymentAmount;
	@Override
	public int hashCode() {
		return Objects.hash(PaymentAmount, PaymentId, PaymentMethod);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(PaymentAmount, other.PaymentAmount) && PaymentId == other.PaymentId
				&& Objects.equals(PaymentMethod, other.PaymentMethod);
	}
	@Override
	public String toString() {
		return "Payment [PaymentId=" + PaymentId + ", PaymentMethod=" + PaymentMethod + ", PaymentAmount="
				+ PaymentAmount + "]";
	}
	
	public int getPaymentId() {
		return PaymentId;
	}
	public void setPaymentId(int paymentId) {
		PaymentId = paymentId;
	}
	public String getPaymentMethod() {
		return PaymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}
	public Double getPaymentAmount() {
		return PaymentAmount;
	}
	public void setPaymentAmount(Double paymentAmount) {
		PaymentAmount = paymentAmount;
	}
	
}
