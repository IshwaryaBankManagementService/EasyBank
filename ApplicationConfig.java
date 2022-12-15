package com.maven.easybank.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.maven.easybank.fomatter.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.maven.easybank")
public class ApplicationConfig implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;

	}

	public void addFormatters(FormatterRegistry registry) {
		System.out.println("Fomatter got initiated");
		registry.addFormatter(new PhoneNumberFormatter());
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {

		JdbcTemplate jdbcTemp = new JdbcTemplate(datasource());
		return jdbcTemp;
	
	}
	@Bean
	public DataSource datasource() {
		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUsername("root");
		datasource.setPassword("Saipr1812!");
		datasource.setUrl("jdbc:mysql://localhost:3306/easybank");
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return datasource;
		
	}
}
