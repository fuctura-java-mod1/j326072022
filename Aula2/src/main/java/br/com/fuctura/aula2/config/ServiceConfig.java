package br.com.fuctura.aula2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.fuctura.aula2.beans.CalculadoraFGTS;

@Configuration
@ComponentScan(basePackages = "br.com.fuctura.aula2")
public class ServiceConfig {
	
//	@Bean
	public CalculadoraFGTS getCalculadoraFGTS() {
		return new CalculadoraFGTS();
	}

}
