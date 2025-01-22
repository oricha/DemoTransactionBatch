package org.example.kmuniz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;



@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long ID;
	private BigDecimal amount;
	private String account_id;
	
	public Transaction(){
		
	}
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getAccount_id() {
		return account_id;
	}
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}
	
}
