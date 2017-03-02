package com.megatech.area.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.megatech.area.model.Area;
import com.megatech.area.repository.AreaRepository;
import com.megatech.site.repository.SiteRepository;

@Service
public class AreaService {

	@Autowired
	private AreaRepository areaRepository;

	@Autowired
	private SiteRepository siteRepository;

	@Transactional
	public List<Area> getAreaByCode(List<String> areaCode) {
		return areaRepository.findByareaCodeIn(areaCode);
	}

	@Transactional
	public List<Area> getAreaByName(List<String> areaName) {
		return areaRepository.findByareaNameIn(areaName);
	}

	public Area findByareaId(Long id) {
		return areaRepository.findByareaId(id);
	}

	public Area findByName(String name) {
		return areaRepository.findByareaName(name);
	}

	public void saveArea(Area area) {
		area.setSite(siteRepository.findOne(area.getSiteId()));
		areaRepository.save(area);
	}

	public void updateArea(Area area) {
		saveArea(area);
	}

	public void deleteAreaById(Long id) {
		areaRepository.delete(id);
	}

	public List<Area> findAllAreas() {
		return areaRepository.findAll();
	}

}
