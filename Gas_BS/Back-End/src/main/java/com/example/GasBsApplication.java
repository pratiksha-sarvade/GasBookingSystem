package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.example.GasBsApplication;
import com.example.config.JwtFilter;

@SpringBootApplication
public class GasBsApplication {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/*");
		return registrationBean;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(GasBsApplication.class, args);
		System.out.println("Welcome to Gas booking system");
	}
}
