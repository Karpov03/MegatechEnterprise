package com.megatech.logics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnergyTimeDataWrapper {

	private EnergyTimeDataWrapper etWrapper;

	/**
	 * @return the etWrapper
	 */
	public EnergyTimeDataWrapper getEtWrapper() {
		return etWrapper;
	}

	/**
	 * @param etWrapper
	 *            the etWrapper to set
	 */
	public void setEtWrapper(EnergyTimeDataWrapper etWrapper) {
		this.etWrapper = etWrapper;
	}

}
