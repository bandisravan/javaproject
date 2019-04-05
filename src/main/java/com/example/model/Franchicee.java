<<<<<<< HEAD
package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name ="franchise")
public class Franchicee {
	
	//@Autowired
	//Breach breach1;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long fid; 
	String fcname; 
	
	@OneToMany(fetch = FetchType.EAGER,cascade= CascadeType.ALL, mappedBy = "fcid")
	//@JoinColumn(name = "bid")
	@JsonManagedReference
	List<Business> businessArea=new ArrayList<>(); 

	//Breach breach;
	
	public Long getFid() {
		return fid;
	}

	public void setFid(Long fid) {
		this.fid = fid;
	}

	public String getFcname() {
		return fcname;
	}

	public void setFcname(String fcname) {
		this.fcname = fcname;
	}

	public List<Business> getBusinessArea() {
		return businessArea;
	}

	public void setBusinessArea(List<Business> businessArea) {
		this.businessArea = businessArea;
	}

	public Franchicee(Long fid) {
		super();
		this.fid = fid;
	}

	public Franchicee() {
		super();
	}
	

}
=======
package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name ="franchise")
public class Franchicee {
	
	//@Autowired
	//Breach breach1;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long fid; 
	String fcname; 
	
	@OneToMany(fetch = FetchType.EAGER,cascade= CascadeType.ALL, mappedBy = "fcid")
	//@JoinColumn(name = "bid")
	@JsonManagedReference
	List<Business> businessArea=new ArrayList<>(); 

	//Breach breach;
	
	public Long getFid() {
		return fid;
	}

	public void setFid(Long fid) {
		this.fid = fid;
	}

	public String getFcname() {
		return fcname;
	}

	public void setFcname(String fcname) {
		this.fcname = fcname;
	}

	public List<Business> getBusinessArea() {
		return businessArea;
	}

	public void setBusinessArea(List<Business> businessArea) {
		this.businessArea = businessArea;
	}

	public Franchicee(Long fid) {
		super();
		this.fid = fid;
	}

	public Franchicee() {
		super();
	}
	

}
>>>>>>> 2b539345beb71df941bff0412249f6e319152358
