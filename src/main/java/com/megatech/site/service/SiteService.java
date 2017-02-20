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
	public List<Site> getAllSite() {
		return siteRepository.findAll();
	}

	@Transactional
	public List<Site> getSiteByCode(List<String> siteCode) {
		return siteRepository.findBysiteCodeIn(siteCode);
	}

	@Transactional
	public List<Site> getSiteByName(List<String> siteName) {
		return siteRepository.findBysiteNameIn(siteName);
	}

}
