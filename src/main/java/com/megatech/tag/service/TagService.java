package com.megatech.tag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.megatech.asset.repository.AssetRepository;
import com.megatech.tag.model.Tag;
import com.megatech.tag.repository.TagRepository;

@Service
public class TagService {
	
	@Autowired
	private AssetRepository assetRepository;
	
	@Autowired
	private TagRepository tagRepository;

	@Transactional
	public List<Tag> getAllTag() {
		return tagRepository.findAll();
	}

	@Transactional
	public List<Tag> getTagByCode(List<String> tagCode) {
		return tagRepository.findBytagCodeIn(tagCode);
	}

	@Transactional
	public List<Tag> getTagByName(List<String> tagName) {
		return tagRepository.findBytagNameIn(tagName);
	}


	public Tag findBytagId(Long id) {
		return tagRepository.findBytagId(id);
	}

	public Tag findByName(String name) {
		return tagRepository.findBytagName(name);
	}

	public void saveTag(Tag tag) {
		tag.setAsset(assetRepository.findOne(tag.getAssetId()));
		tagRepository.save(tag);
	}

	public void updateTag(Tag tag) {
		saveTag(tag);
	}

	public void deleteTagById(Long id) {
		tagRepository.delete(id);
	}

	public List<Tag> findAllTags() {
		return tagRepository.findAll();
	}


}

