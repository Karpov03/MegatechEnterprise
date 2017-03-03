package com.megatech.asset.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.megatech.area.repository.AreaRepository;
import com.megatech.asset.model.Asset;
import com.megatech.asset.repository.AssetRepository;

@Service
public class AssetService {
	
	@Autowired
	private AssetRepository assetRepository;
	
	@Autowired
	private AreaRepository areaRepository;

	@Transactional
	public List<Asset> getAllAsset() {
		return assetRepository.findAll();
	}

	@Transactional
	public List<Asset> getAssetByCode(List<String> assetCode) {
		return assetRepository.findByassetCodeIn(assetCode);
	}

	@Transactional
	public List<Asset> getAssetByName(List<String> assetName) {
		return assetRepository.findByassetNameIn(assetName);
	}

	@Transactional
	public List<Asset> getAssetByModel(List<String> assetModel) {
		return assetRepository.findBymodelIn(assetModel);
	}

	@Transactional
	public List<Asset> getAssetByMake(List<String> assetMake) {
		return assetRepository.findBymakeIn(assetMake);
	}
	
	

	public Asset findByassetId(Long id) {
		return assetRepository.findByassetId(id);
	}

	public Asset findByName(String name) {
		return assetRepository.findByassetName(name);
	}

	public void saveAsset(Asset asset) {
		asset.setArea(areaRepository.findOne(asset.getAreaId()));
		assetRepository.save(asset);
	}

	public void updateAsset(Asset asset) {
		saveAsset(asset);
	}

	public void deleteAssetById(Long id) {
		assetRepository.delete(id);
	}

	public List<Asset> findAllAssets() {
		return assetRepository.findAll();
	}

}
