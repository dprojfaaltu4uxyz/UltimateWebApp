package com.webapp.project.modules.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.webapp.project.framework.model.UserProfile;
import com.webapp.project.framework.service.UserProfileService;
import com.webapp.project.modules.masters.model.Port;
import com.webapp.project.modules.masters.service.PortService;

/**
 * A converter class used in views to map id's to actual userProfile objects.
 */
@Component
public class IDToPortConverter implements Converter<Object, Port>{

	static final Logger logger = LoggerFactory.getLogger(IDToPortConverter.class);
	
	@Autowired
	PortService portService;

	/**
	 * Gets UserProfile by Id
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
	 */
	public Port convert(Object element) {
		Long id = Long.parseLong((String)element);
		Port port= portService.findById(id);
		logger.info("port : {}",port);
		return port;
	}
	
}