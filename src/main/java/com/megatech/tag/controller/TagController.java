//package com.megatech.tag.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.megatech.tag.model.Tag;
//import com.megatech.tag.service.TagService;
//
////@RestController
//@RequestMapping(value = "/tag")
//public class TagController {
//
//	@Autowired
//	private TagService tagService;
//
//	@RequestMapping(value = "/")
//	public String index() {
//
//		return "Welcome TagController";
//	}
//
//	@RequestMapping(value = "/getTag", method = RequestMethod.GET)
//	public List<Tag> getTag() {
//		return tagService.getAllTag();
//	}
//
//	// ################ getTag by Code ####################
//	@RequestMapping(value = "/getTag/code/{tagCode}", method = RequestMethod.GET)
//	public List<Tag> getTagByCode(@PathVariable List<String> tagCode) {
//		System.out.println("Get Tag By Given Tag Code");
//		return tagService.getTagByCode(tagCode);
//	}
//
//	// ################ getTag by Name ####################
//	@RequestMapping(value = "/getTag/name/{tagName}", method = RequestMethod.GET)
//	public List<Tag> getTagByName(@PathVariable List<String> tagName) {
//		System.out.println("Get Tag By Name");
//		return tagService.getTagByName(tagName);
//	}
//
//}
//
