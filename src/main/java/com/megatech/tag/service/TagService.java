//package com.megatech.tag.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.megatech.tag.model.Tag;
//import com.megatech.tag.repository.TagRepository;
//
//@Service
//public class TagService {
//	
//	@Autowired
//	private TagRepository tagRepository;
//
//	@Transactional
//	public List<Tag> getAllTag() {
//		return tagRepository.findAll();
//	}
//
//	@Transactional
//	public List<Tag> getTagByCode(List<String> tagCode) {
//		return tagRepository.findBytagCodeIn(tagCode);
//	}
//
//	@Transactional
//	public List<Tag> getTagByName(List<String> tagName) {
//		return tagRepository.findBytagNameIn(tagName);
//	}
//
//	
//
//}
//
