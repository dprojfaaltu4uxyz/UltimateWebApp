package com.webapp.project.framework.configuration;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.atmosphere.cpr.MeteorServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {  

		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();  
		ctx.register(AppConfig.class);  

		ctx.setServletContext(servletContext);    

		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));  
		servlet.addMapping("/");  
		servlet.setLoadOnStartup(1);  
		servlet.setMultipartConfig(getMultipartConfigElement());

		ServletRegistration.Dynamic atmosphereServlet = servletContext.addServlet("MeteorServlet", MeteorServlet.class.getName());
		atmosphereServlet.setLoadOnStartup(1);
		atmosphereServlet.addMapping("/");
		atmosphereServlet.setAsyncSupported(true);


	}  

	private MultipartConfigElement getMultipartConfigElement(){
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(LOCATION, MAX_FILE_SIZE, MAX_REQUEST_SIZE, FILE_SIZE_THRESHOLD);
		return multipartConfigElement;
	}

	/*Set these variables for your project needs*/ 

	private static final String LOCATION = "D:/mytemp/";

	private static final long MAX_FILE_SIZE = 1024 * 1024 * 25;//25MB

	private static final long MAX_REQUEST_SIZE = 1024 * 1024 * 30;//30MB

	private static final int FILE_SIZE_THRESHOLD = 0;
}
