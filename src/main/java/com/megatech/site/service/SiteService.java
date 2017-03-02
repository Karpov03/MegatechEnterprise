package com.megatech.site.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.megatech.site.model.Site;
import com.megatech.site.repository.SiteRepository;

@Service
public class SiteService {

	@Autowired
	SiteRepository siteRepository;

	@Transactional
<<<<<<< HEAD
	public List<Site> getAllSite() {
		return siteRepository.findAll();
	}

	@Transactional
	public Site findSiteById(Integer siteId) {
		return siteRepository.findBysiteId(siteId);
	}

	@Transactional
=======
>>>>>>> origin/master
	public List<Site> getSiteById(List<Integer> siteId) {
		return siteRepository.findBysiteIdIn(siteId);
	}

	@Transactional
	public List<Site> getSiteByCode(List<String> siteCode) {
		return siteRepository.findBysiteCodeIn(siteCode);
	}

	@Transactional
	public List<Site> getSiteByName(List<String> siteName) {
		return siteRepository.findBysiteNameIn(siteName);
	}

<<<<<<< HEAD
	@Transactional
	public Site saveSite(Site site) {
		return siteRepository.save(site);
	}
	
	@Transactional
	public void deleteSite(Long siteId) {
		siteRepository.delete(siteId);
=======
	public Site findBysiteId(Long id) {
		return siteRepository.findBysiteId(id);
	}

	public Site findByName(String name) {
		return siteRepository.findBysiteName(name);
	}

	public void saveSite(Site site) {
		siteRepository.save(site);
	}

	public void updateSite(Site site) {
		saveSite(site);
	}

	public void deleteSiteById(Long id) {
		siteRepository.delete(id);
	}


	public List<Site> findAllSites() {
		return siteRepository.findAll();
>>>>>>> origin/master
	}

}
