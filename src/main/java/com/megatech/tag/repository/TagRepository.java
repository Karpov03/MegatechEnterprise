package com.megatech.tag.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.megatech.tag.model.Tag;

@RepositoryRestResource
public interface TagRepository extends JpaRepository<Tag, Long> {

	@RestResource(rel = "tag_codes", path = "containsCode")
	public List<Tag> findBytagCodeIn(@Param("tagCode") List<String> tagCode);
	@RestResource(rel = "tag_names", path = "containsName")
	public List<Tag> findBytagNameIn(@Param("tagName") List<String> tagName);

}
