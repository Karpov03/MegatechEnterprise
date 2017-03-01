//package com.megatech.asset.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.megatech.asset.model.Asset;
//import com.megatech.asset.service.AssetService;
//
//@RestController
//@RequestMapping(value = "/asset")
//public class AssetController {
//
//	@Autowired
//	private AssetService assetService;
//
//	@RequestMapping(value = "/")
//	public String index() {
//
//		return "Welcome AssetController";
//	}
//
//	@RequestMapping(value = "/getAsset", method = RequestMethod.GET)
//	public List<Asset> getAsset() {
//		return assetService.getAllAsset();
//	}
//
//	// ################ getAsset by Code ####################
//	@RequestMapping(value = "/getAsset/code/{assetCode}", method = RequestMethod.GET)
//	public List<Asset> getAssetByCode(@PathVariable List<String> assetCode) {
//		System.out.println("Get Asset By Given Asset Code");
//		return assetService.getAssetByCode(assetCode);
//	}
//
//	// ################ getAsset by Name ####################
//	@RequestMapping(value = "/getAsset/name/{assetName}", method = RequestMethod.GET)
//	public List<Asset> getAssetByName(@PathVariable List<String> assetName) {
//		System.out.println("Get Asset By Name");
//		return assetService.getAssetByName(assetName);
//	}
//
//	// ################ getAsset by Make ####################
//	@RequestMapping(value = "/getAsset/make/{assetMake}", method = RequestMethod.GET)
//	public List<Asset> getAssetByMake(@PathVariable List<String> assetMake) {
//		System.out.println("Get Asset By Make");
//		return assetService.getAssetByMake(assetMake);
//	}
//
//	// ################ getAsset by Model ####################
//	@RequestMapping(value = "/getAsset/model/{assetModel}", method = RequestMethod.GET)
//	public List<Asset> getAssetByModel(@PathVariable List<String> assetModel) {
//		System.out.println("Get Asset By Model");
//		return assetService.getAssetByModel(assetModel);
//	}
//}
