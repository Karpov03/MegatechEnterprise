package com.megatech.area.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megatech.area.model.Area;
import com.megatech.area.service.AreaService;

@RestController
@RequestMapping(value = "/area")
public class AreaController {

	@Autowired
	private AreaService areaService;

	@GetMapping(value = "/")
	public String index() {

		return "Welcome AreaController Welcome";
	}

	@GetMapping(value = "/list")
	public List<Area> getArea() {
		return areaService.findAllAreas();
	}

	@GetMapping(value = "/getlist/code/{areaCode}")
	public List<Area> getAreaByCode(@PathVariable List<String> areaCode) {
		System.out.println("Get Area By Given Area Code");
		return areaService.getAreaByCode(areaCode);
	}

	@GetMapping(value = "/getlist/name/{areaName}")
	public List<Area> getAreaByName(@PathVariable List<String> areaName) {
		System.out.println("Get Area By Name");
		return areaService.getAreaByName(areaName);
	}
	
	@PostMapping(value = "/save")
	public void createArea(@RequestBody Area area) {
		System.out.println("Area Created");
		areaService.saveArea(area);

	}

	@PutMapping(value = "/update/{id}")
	public void updateArea(@PathVariable("id") long id, @RequestBody Area area) {
		Area currentArea = areaService.findByareaId(id);

		if (currentArea == null) {
			System.out.println("Area Not Found");
		}

		currentArea.setAreaCode(area.getAreaCode());
		currentArea.setAreaName(area.getAreaName());

		areaService.updateArea(currentArea);

		System.out.println("Area Updated");

	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteArea(@PathVariable("id") long id) {

		Area area = areaService.findByareaId(id);
		System.out.println(area);
		if (area == null) {
			System.out.println("Area Not Found");
		}
		areaService.deleteAreaById(id);
		System.out.println("Area Deleted");

	}
	
}
