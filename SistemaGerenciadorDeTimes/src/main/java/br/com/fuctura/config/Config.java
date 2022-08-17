package br.com.fuctura.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
	
	@Bean
	public RestTemplate getTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	 //2 data source
}
