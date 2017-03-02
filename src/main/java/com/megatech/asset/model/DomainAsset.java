package com.megatech.asset.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Access(AccessType.FIELD)
@DiscriminatorValue(value="A")
public class DomainAsset extends Asset {
	private String rpm;

	public String getRpm() {
		return rpm;
	}

	public void setRpm(String rpm) {
		this.rpm = rpm;
	}

}
