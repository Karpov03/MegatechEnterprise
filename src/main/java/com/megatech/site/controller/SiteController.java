package com.megatech.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megatech.site.model.Site;
import com.megatech.site.service.SiteService;

@RestController
@RequestMapping(value = "/site")
public class SiteController {

	@Autowired
	private SiteService siteService;

	@GetMapping(value = "/")
	public String index() {

		return "Hi SiteController";
	}


	@GetMapping(value = "/list")
	public List<Site> listAllSites() {
		return siteService.findAllSites();
	}

	@GetMapping(value = "/getlist/{siteId}")
	public List<Site> getSiteById(@PathVariable List<Long> siteId) {
		System.out.println("Get Site By Given Site COde");
		return siteService.getSiteById(siteId);
	}

	@GetMapping(value = "/getlist/code/{siteCode}")
	public List<Site> getSiteByCode(@PathVariable List<String> siteCode) {
		System.out.println("Get Site By Given Site COde");
		return siteService.getSiteByCode(siteCode);
	}

	@GetMapping(value = "/getlist/name/{siteName}")
	public List<Site> getSiteByName(@PathVariable List<String> siteName) {
		System.out.println("Get Site By Name");
		return siteService.getSiteByName(siteName);
	}

	@PostMapping(value = "/save")
	public void createSite(@RequestBody Site site) {
		System.out.println("Site Created");
		siteService.saveSite(site);

	}

	@PutMapping(value = "/update/{id}")
	public void updateSite(@PathVariable("id") long id, @RequestBody Site site) {
		Site currentSite = siteService.findBysiteId(id);

		if (currentSite == null) {
			System.out.println("Site Not Found");
		}

		currentSite.setSiteCode(site.getSiteCode());
		currentSite.setSiteName(site.getSiteName());

		siteService.updateSite(currentSite);

		System.out.println("Site Updated");

	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteSite(@PathVariable("id") long id) {

		Site site = siteService.findBysiteId(id);
		System.out.println(site);
		if (site == null) {
			System.out.println("Site Not Found");
		}
		siteService.deleteSiteById(id);
		System.out.println("Site Deleted");

	}

}
