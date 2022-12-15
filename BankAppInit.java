package com.maven.easybank.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BankAppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class[] applconfig = { ApplicationConfig.class };
		return applconfig;
	}

	@Override
	protected String[] getServletMappings() {
		String mappings[] = { "/" };
		return mappings;
	}

}
