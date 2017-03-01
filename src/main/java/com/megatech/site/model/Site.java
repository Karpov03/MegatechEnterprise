package com.megatech.site.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.megatech.area.model.Area;

@Entity
@Table(name = "SITE")
public class Site {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long siteId;
	@NotNull
	@Size(min=3,max=40)
	private String siteName;
	@NotNull
	@Size(min=3,max=40)
	private String siteCode;

	 @OneToMany(mappedBy = "site", cascade = CascadeType.ALL, fetch =
	 FetchType.EAGER)
	 private Collection<Area> area = new ArrayList<Area>();

	public long getSiteId() {
		return siteId;
	}

	public void setSiteId(long siteId) {
		this.siteId = siteId;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	 public Collection<Area> getArea() {
	 return area;
	 }
	
	 public void setArea(Collection<Area> area) {
	 this.area = area;
	 }

}
