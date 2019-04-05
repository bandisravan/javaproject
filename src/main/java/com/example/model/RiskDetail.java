<<<<<<< HEAD
package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Risk")
public class RiskDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long riskId;
	private Long userId;
	private Long adminId;
	private Long fId;
	private Long baId;
	private Long breachId;
	
	public Long getRiskId() {
		return riskId;
	}
	public void setRiskId(Long riskId) {
		this.riskId = riskId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	public Long getfId() {
		return fId;
	}
	public void setfId(Long fId) {
		this.fId = fId;
	}
	public Long getBaId() {
		return baId;
	}
	public void setBaId(Long baId) {
		this.baId = baId;
	}
	public Long getBreachId() {
		return breachId;
	}
	public void setBreachId(Long breachId) {
		this.breachId = breachId;
	}
	
	
	
	
	
}
=======
package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Risk")
public class RiskDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long riskId;
	private Long userId;
	private Long adminId;
	private Long fId;
	private Long baId;
	private Long breachId;
	
	public Long getRiskId() {
		return riskId;
	}
	public void setRiskId(Long riskId) {
		this.riskId = riskId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	public Long getfId() {
		return fId;
	}
	public void setfId(Long fId) {
		this.fId = fId;
	}
	public Long getBaId() {
		return baId;
	}
	public void setBaId(Long baId) {
		this.baId = baId;
	}
	public Long getBreachId() {
		return breachId;
	}
	public void setBreachId(Long breachId) {
		this.breachId = breachId;
	}
	
	
	
	
	
}
>>>>>>> 2b539345beb71df941bff0412249f6e319152358
