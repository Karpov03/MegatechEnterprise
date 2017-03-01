package com.megatech.asset.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.megatech.asset.model.Asset;

@RepositoryRestResource
public interface AssetRepository extends JpaRepository<Asset, Long> {
	@RestResource(rel = "asset_codes", path = "containsCode")
	public List<Asset> findByassetCodeIn(@Param("assetCode") List<String> assetCode);

	@RestResource(rel = "asset_names", path = "containsName")
	public List<Asset> findByassetNameIn(@Param("assetName") List<String> assetName);

	@RestResource(rel = "asset_makes", path = "containsMake")
	public List<Asset> findBymakeIn(@Param("make") List<String> make);

	@RestResource(rel = "asset_model", path = "containsModel")
	public List<Asset> findBymodelIn(@Param("model") List<String> model);

}
