package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="breach_category")
public class Breach {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bId;
	private String bValue;
	public Long getbId() {
		return bId;
	}
	public void setbId(Long bId) {
		this.bId = bId;
	}
	public String getbValue() {
		return bValue;
	}
	public void setbValue(String bValue) {
		this.bValue = bValue;
	}
	
	
	

	
	
}
