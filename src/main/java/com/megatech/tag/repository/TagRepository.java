package com.megatech.tag.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megatech.tag.model.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

	public List<Tag> findBytagCodeIn(List<String> tagCode);

	public List<Tag> findBytagNameIn(List<String> tagName);
	
	public Tag findBytagName(String name);

	public Tag findBytagId(Long id);

}
