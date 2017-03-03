package com.megatech.tag.controller;

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

import com.megatech.tag.model.Tag;
import com.megatech.tag.service.TagService;

@RestController
@RequestMapping(value = "/tag")
public class TagController {

	@Autowired
	private TagService tagService;

	@GetMapping(value = "/")
	public String index() {

		return "Welcome TagController";
	}

	@GetMapping(value = "/list")
	public List<Tag> getTag() {
		return tagService.findAllTags();
	}

	// ################ getTag by Code ####################
	@GetMapping(value = "/getlist/code/{tagCode}")
	public List<Tag> getTagByCode(@PathVariable List<String> tagCode) {
		System.out.println("Get Tag By Given Tag Code");
		return tagService.getTagByCode(tagCode);
	}

	// ################ getTag by Name ####################
	@GetMapping(value = "/getlist/name/{tagName}")
	public List<Tag> getTagByName(@PathVariable List<String> tagName) {
		System.out.println("Get Tag By Name");
		return tagService.getTagByName(tagName);
	}

	@PostMapping(value = "/save")
	public void createTag(@RequestBody Tag tag) {
		System.out.println("Tag Created");
		tagService.saveTag(tag);

	}

	@PutMapping(value = "/update/{id}")
	public void updateTag(@PathVariable("id") long id, @RequestBody Tag tag) {
		Tag currentTag = tagService.findBytagId(id);

		if (currentTag == null) {
			System.out.println("Tag Not Found");
		}

		currentTag.setTagCode(tag.getTagCode());
		currentTag.setTagName(tag.getTagName());

		tagService.updateTag(currentTag);

		System.out.println("Tag Updated");

	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteTag(@PathVariable("id") long id) {

		Tag tag = tagService.findBytagId(id);
		System.out.println(tag);
		if (tag == null) {
			System.out.println("Tag Not Found");
		}
		tagService.deleteTagById(id);
		System.out.println("Tag Deleted");

	}

}
