package com.megatech.area.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.megatech.area.model.Area;

@RepositoryRestResource
public interface AreaRepository extends JpaRepository<Area, Long> {
	@RestResource(rel = "area_codes", path = "containsCode")
	public List<Area> findByareaCodeIn(@Param("areaCode") List<String> areaCode);

	@RestResource(rel = "area_names", path = "containsName")
	public List<Area> findByareaNameIn(@Param("areaName") List<String> areaName);

}
