package com.megatech.area.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.megatech.area.model.Area;
import com.megatech.area.repository.AreaRepository;

@Service
public class AreaService {
	@Autowired
	private AreaRepository areaRepository;

	@Transactional
	public List<Area> getAllArea() {
		return areaRepository.findAll();
	}

	@Transactional
	public List<Area> getAreaByCode(List<String> areaCode) {
		return areaRepository.findByareaCodeIn(areaCode);
	}

	@Transactional
	public List<Area> getAreaByName(List<String> areaName) {
		return areaRepository.findByareaNameIn(areaName);
	}

}
