package com.megatech.logics;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnergyTimeData {

	private Date timestamps;

	private Integer tagid;

	private float value;

	public EnergyTimeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getEnergytime() {
		return timestamps;
	}

	public void setEnergytime(Date energytime) {
		this.timestamps = energytime;
	}

	public Integer getTagid() {
		return tagid;
	}

	public void setTagid(Integer tagid) {
		this.tagid = tagid;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public EnergyTimeData(Date timestamps, Integer tagid, float value) {
		super();
		this.timestamps = timestamps;
		this.tagid = tagid;
		this.value = value;
	}

	@Override
	public String toString() {
		return "EnergyTimeData [timestamps=" + timestamps + ", tagid=" + tagid + ", value=" + value + "]";
	}

}
