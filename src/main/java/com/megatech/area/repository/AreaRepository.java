package com.megatech.area.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megatech.area.model.Area;

//@RepositoryRestResource
@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {
	
	public List<Area> findByareaCodeIn(List<String> areaCode);

	public List<Area> findByareaNameIn(List<String> areaName);

	public Area findByareaName(String name);

	public Area findByareaId(Long id);

}
