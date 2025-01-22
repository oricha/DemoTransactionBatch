package org.example.kmuniz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;



@Entity
public class Account {
	
	@Id
	private String accountNumber;
	private BigDecimal amount;
	private long person_id;
	
	public Account(){
		
	}
	public String getAccount_number() {
		return accountNumber;
	}
	public void setAccount_number(String account_number) {
		this.accountNumber = account_number;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public long getPerson_id() {
		return person_id;
	}
	public void setPerson_id(long person_id) {
		this.person_id = person_id;
	}
	
	
		

}
