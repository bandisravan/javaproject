package com.example.model;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name ="business_area")
public class Business {
	
	@Id
	@GeneratedValue
	private Long baid;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fcId")
	@JsonBackReference
	private Franchicee fcid; 
	private String baname; 
	

	public Business() {
		super();
	}

	public Business(Long baid) {
		super();
		this.baid = baid;
	}

	public Long getBaid() {
		return baid;
	}

	public void setBaid(Long baid) {
		this.baid = baid;
	}



	public Franchicee getFcid() {
		return fcid;
	}

	public void setFcid(Franchicee fcid) {
		this.fcid = fcid;
	}

	public String getBaname() {
		return baname;
	}

	public void setBaname(String baname) {
		this.baname = baname;
	}

}
