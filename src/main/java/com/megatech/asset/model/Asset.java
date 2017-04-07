package com.megatech.asset.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.megatech.area.model.Area;
import com.megatech.tag.model.Tag;

//@Entity
//@Table(name = "ASSET")
@Entity(name = "ASSET")
// @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// @DiscriminatorColumn(name="type", discriminatorType=DiscriminatorType.STRING)
// @DiscriminatorValue(value="A")
public class Asset {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int assetId;
	@NotNull
	@Size(min = 3, max = 40)
	private String assetName;
	@NotNull
	@Size(min = 3, max = 40)
	private String assetCode;
	private String make;
	private String model;
	@Temporal(TemporalType.TIMESTAMP)
	private Date installDate;

	private transient Long areaId;

	@ManyToOne
	@JoinColumn(name = "area_id", nullable = false)
	private Area area;

	@OneToMany(mappedBy = "asset", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Collection<Tag> tag = new ArrayList<Tag>();

	public int getAssetId() {
		return assetId;
	}

	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetCode() {
		return assetCode;
	}

	public void setAssetCode(String assetCode) {
		this.assetCode = assetCode;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Date getInstallDate() {
		return installDate;
	}

	public void setInstallDate(Date installDate) {
		this.installDate = installDate;
	}

	@JsonIgnore
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Collection<Tag> getTag() {
		return tag;
	}

	public void setTag(Collection<Tag> tag) {
		this.tag = tag;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

}
