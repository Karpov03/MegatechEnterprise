//package com.megatech;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
//import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
//import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
//import org.springframework.validation.Validator;
//
//import com.megatech.area.model.Area;
//import com.megatech.site.model.Site;
//
////@Configuration
//public class RestConfig extends RepositoryRestConfigurerAdapter {
//
//	//@Autowired
//	private Validator validator;
//	
//
//	@Autowired
//	public RestConfig(Validator validator) {
//		//super();
//		this.validator = validator;
//	}
//
//
//	@Override
//	public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
//
//		validatingListener.addValidator("beforeCreate", validator);
//		validatingListener.addValidator("beforeSave", validator);
//	}
//
//
//	@Override
//	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//		config.exposeIdsFor(Site.class, Area.class);
//		config.setReturnBodyOnCreate(true);
//		config.setReturnBodyOnUpdate(true);
//	}
//}
