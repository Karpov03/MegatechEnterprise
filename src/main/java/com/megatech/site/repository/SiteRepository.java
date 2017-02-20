package com.megatech.site.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megatech.site.model.Site;

@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {
	
	public List<Site> findBysiteCodeIn(List<String> siteCode);

	public List<Site> findBysiteNameIn(List<String> siteName);

}
