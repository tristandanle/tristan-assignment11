package com.codercampus.Assignment11.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction implements Serializable{
	private static final long serialVersionUID = 5489045104890844953L;
// Transaction [id=17, retailer=Kroger, description=Kroger Store #271, date=2020-01-01T22:43:35, amount=9.18, type=D]	
	private Long id;
	private String retailer;
	private String description;
	private LocalDateTime date;
	private BigDecimal amount;
	private String type;  // D , C
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRetailer() {
		return retailer;
	}
	public void setRetailer(String retailer) {
		this.retailer = retailer;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", retailer=" + retailer + ", description=" + description + ", date=" + date
				+ ", amount=" + amount + ", type=" + type + "]";
	}
	
}
