//package com.megatech.area.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.megatech.area.model.Area;
//import com.megatech.area.service.AreaService;
//
//@RestController
//@RequestMapping(value = "/area")
//public class AreaController {
//
//	@Autowired
//	private AreaService areaService;
//
//	@RequestMapping(value = "/")
//	public String index() {
//
//		return "Welcome AreaController Welcome";
//	}
//
//	@RequestMapping(value = "/getArea", method = RequestMethod.GET)
//	public List<Area> getArea() {
//		return areaService.getAllArea();
//	}
//
//	// ################ getArea by Code ####################
//	@RequestMapping(value = "/getArea/code/{areaCode}", method = RequestMethod.GET)
//	public List<Area> getAreaByCode(@PathVariable List<String> areaCode) {
//		System.out.println("Get Area By Given Area Code");
//		return areaService.getAreaByCode(areaCode);
//	}
//
//	// ################ getArea by Name ####################
//	@RequestMapping(value = "/getArea/name/{areaName}", method = RequestMethod.GET)
//	public List<Area> getAreaByName(@PathVariable List<String> areaName) {
//		System.out.println("Get Area By Name");
//		return areaService.getAreaByName(areaName);
//	}
//}
