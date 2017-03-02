package com.megatech.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Site> getSite() {
		return siteService.getAllSite();
	}
	
	// ################ getSite by Id ####################
			@RequestMapping(value = "/show/{siteId}", method = RequestMethod.GET)
			public List<Site> getSiteById(@PathVariable List<Integer> siteId) {
				System.out.println("Get Site By Given Site COde");
				return siteService.getSiteById(siteId);
			}
	
	// ################ getSite by Code ####################
		@RequestMapping(value = "/show/code/{siteCode}", method = RequestMethod.GET)
		public List<Site> getSiteByCode(@PathVariable List<String> siteCode) {
			System.out.println("Get Site By Given Site COde");
			return siteService.getSiteByCode(siteCode);
		}

		// ################ getSite by Name ####################
		@RequestMapping(value = "/show/name/{siteName}", method = RequestMethod.GET)
		public List<Site> getSiteByName(@PathVariable List<String> siteName) {
			System.out.println("Get Site By Name");
			return siteService.getSiteByName(siteName);
		}
		
		 @RequestMapping(value = "/add", method = RequestMethod.POST)
		    public ResponseEntity saveSite(@RequestBody Site site){
		        siteService.saveSite(site);
		        return new ResponseEntity("Site saved successfully", HttpStatus.OK);
		    }
		 
		 
		    @RequestMapping(value = "/update/{siteId}", method = RequestMethod.PUT)
		    public ResponseEntity updateSite(@PathVariable Integer siteId, @RequestBody Site site){
		        Site storedSite = siteService.findSiteById(siteId);
		        storedSite.setSiteCode(site.getSiteCode());
		        storedSite.setSiteName(site.getSiteName());
		      //  storedSite.setPrice(product.getPrice());
		        siteService.saveSite(site);
		        return new ResponseEntity("Site updated successfully", HttpStatus.OK);
		    }
		 
		  
		    @RequestMapping(value="/delete/{siteId}", method = RequestMethod.DELETE)
		    public ResponseEntity delete(@PathVariable Long siteId){
		    	siteService.deleteSite(siteId);
		        return new ResponseEntity("Site deleted successfully", HttpStatus.OK);
		 
		    }
		
	

}
