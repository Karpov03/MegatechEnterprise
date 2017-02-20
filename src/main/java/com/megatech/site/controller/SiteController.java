package com.megatech.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.megatech.site.model.Site;
import com.megatech.site.service.SiteService;

@RestController
@RequestMapping(value = "/site")
public class SiteController {

	@Autowired
	private SiteService siteService;

	@RequestMapping(value = "/")
	public String index() {

		return "Hi SiteController";
	}

	@RequestMapping(value = "/getSite", method = RequestMethod.GET)
	public List<Site> getSite() {
		return siteService.getAllSite();
	}
	
	// ################ getSite by Code ####################
		@RequestMapping(value = "/getSite/code/{siteCode}", method = RequestMethod.GET)
		public List<Site> getSiteByCode(@PathVariable List<String> siteCode) {
			System.out.println("Get Site By Given Site COde");
			return siteService.getSiteByCode(siteCode);
		}

		// ################ getSite by Name ####################
		@RequestMapping(value = "/getSite/name/{siteName}", method = RequestMethod.GET)
		public List<Site> getSiteByName(@PathVariable List<String> siteName) {
			System.out.println("Get Site By Name");
			return siteService.getSiteByName(siteName);
		}
	

}
