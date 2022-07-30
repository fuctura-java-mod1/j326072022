package br.com.fuctura.aula2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.fuctura.aula2.beans.CalculadorResumo;
import br.com.fuctura.aula2.beans.CalculadoraFGTS;
import br.com.fuctura.aula2.config.ServiceConfig;

@SpringBootApplication
public class Aula2Application {

	public static void main(String[] args) {
//		SpringApplication.run(Aula2Application.class, args);
	
		var contexto  =  new AnnotationConfigApplicationContext(ServiceConfig.class);
	
		var fgts = contexto.getBean(CalculadoraFGTS.class);
		
		System.out.println(fgts.calcular(1.90));
		
//		var naoVai = contexto.getBean(NaoEhBean.class);
		
		var resumo = contexto.getBean(CalculadorResumo.class);
		
		resumo.exibirResumo(1.90);
	}

}
