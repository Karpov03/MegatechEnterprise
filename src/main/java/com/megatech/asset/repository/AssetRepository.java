package com.megatech.asset.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megatech.asset.model.Asset;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {
	public List<Asset> findByassetCodeIn( List<String> assetCode);

	public List<Asset> findByassetNameIn(List<String> assetName);

	public List<Asset> findBymakeIn( List<String> make);

	public List<Asset> findBymodelIn( List<String> model);

}
