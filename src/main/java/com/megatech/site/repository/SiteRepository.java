package com.megatech.site.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megatech.site.model.Site;

@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {

<<<<<<< HEAD
//	@RestResource(rel = "site_codes", path = "containsCode")
//	public List<Site> findBysiteCodeIn(@Param("siteCode") List<String> siteCode);
//
//	@RestResource(rel = "site_names", path = "containsName")
//	public List<Site> findBysiteNameIn(@Param("siteName") List<String> siteName);
//
//	@RestResource(rel = "site_id", path = "containsId")
//	public List<Site> findBysiteIdIn(@Param("siteId") List<Integer> siteId);
	

	public List<Site> findBysiteCodeIn( List<String> siteCode);

	
	public List<Site> findBysiteNameIn( List<String> siteName);

	
	public List<Site> findBysiteIdIn(List<Integer> siteId);
	public Site findBysiteId(Integer siteId);
=======
	public List<Site> findBysiteCodeIn(List<String> siteCode);

	Site findBysiteName(String name);

	public List<Site> findBysiteNameIn(List<String> siteName);

	public List<Site> findBysiteIdIn(List<Integer> siteId);

	Site findBysiteId(Long id);
>>>>>>> origin/master

}
