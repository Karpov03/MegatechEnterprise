package com.megatech.site.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.megatech.site.model.Site;

@RepositoryRestResource
public interface SiteRepository extends JpaRepository<Site, Long> {

	@RestResource(rel = "site_codes", path = "containsCode")
	public List<Site> findBysiteCodeIn(@Param("siteCode") List<String> siteCode);

	@RestResource(rel = "site_names", path = "containsName")
	public List<Site> findBysiteNameIn(@Param("siteName") List<String> siteName);

	@RestResource(rel = "site_id", path = "containsId")
	public List<Site> findBysiteIdIn(@Param("siteId") List<Integer> siteId);

}
