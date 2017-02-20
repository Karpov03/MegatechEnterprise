package com.megatech.area.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.megatech.asset.model.Asset;
import com.megatech.site.model.Site;

@Entity
@Table(name = "AREA")
public class Area {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int areaId;
	private String areaName;
	private String areaCode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "site_id", nullable = false)
	private Site site;

	@OneToMany(mappedBy = "area", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Collection<Asset> asset = new ArrayList<Asset>();

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	@JsonIgnore
	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public Collection<Asset> getAsset() {
		return asset;
	}

	public void setAsset(Collection<Asset> asset) {
		this.asset = asset;
	}

}
