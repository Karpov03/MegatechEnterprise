package com.megatech.asset.controller;

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

import com.megatech.asset.model.Asset;
import com.megatech.asset.service.AssetService;

@RestController
@RequestMapping(value = "/asset")
public class AssetController {

	@Autowired
	private AssetService assetService;

	@GetMapping(value = "/")
	public String index() {

		return "Welcome AssetController";
	}

	@GetMapping(value = "/list")
	public List<Asset> getAsset() {
		return assetService.findAllAssets();
	}

	// ################ getAsset by Code ####################
	@GetMapping(value =  "/getlist/code/{assetCode}")
	public List<Asset> getAssetByCode(@PathVariable List<String> assetCode) {
		System.out.println("Get Asset By Given Asset Code");
		return assetService.getAssetByCode(assetCode);
	}

	// ################ getAsset by Name ####################
	@GetMapping(value = "/getlist/name/{assetName}")
	public List<Asset> getAssetByName(@PathVariable List<String> assetName) {
		System.out.println("Get Asset By Name");
		return assetService.getAssetByName(assetName);
	}

	// ################ getAsset by Make ####################
	@GetMapping(value =  "/getlist/make/{assetMake}")
	public List<Asset> getAssetByMake(@PathVariable List<String> assetMake) {
		System.out.println("Get Asset By Make");
		return assetService.getAssetByMake(assetMake);
	}

	// ################ getAsset by Model ####################
	@GetMapping(value =  "/getlist/model/{assetModel}")
	public List<Asset> getAssetByModel(@PathVariable List<String> assetModel) {
		System.out.println("Get Asset By Model");
		return assetService.getAssetByModel(assetModel);
	}
	
	@PostMapping(value = "/save")
	public void createAsset(@RequestBody Asset asset) {
		System.out.println("Asset Created");
		assetService.saveAsset(asset);

	}

	@PutMapping(value = "/update/{id}")
	public void updateAsset(@PathVariable("id") long id, @RequestBody Asset asset) {
		Asset currentAsset = assetService.findByassetId(id);

		if (currentAsset == null) {
			System.out.println("Asset Not Found");
		}

		currentAsset.setAssetCode(asset.getAssetCode());
		currentAsset.setAssetName(asset.getAssetName());

		assetService.updateAsset(currentAsset);

		System.out.println("Asset Updated");

	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteAsset(@PathVariable("id") long id) {

		Asset asset = assetService.findByassetId(id);
		System.out.println(asset);
		if (asset == null) {
			System.out.println("Asset Not Found");
		}
		assetService.deleteAssetById(id);
		System.out.println("Asset Deleted");

	}
	

}
