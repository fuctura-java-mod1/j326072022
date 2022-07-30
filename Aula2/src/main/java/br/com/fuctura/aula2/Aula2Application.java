package br.com.fuctura.aula2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.fuctura.aula2.beans.Avaliador;
import br.com.fuctura.aula2.config.ServiceConfig;

@SpringBootApplication
public class Aula2Application {

	public static void main(String[] args) {
		var contexto  =  new AnnotationConfigApplicationContext(ServiceConfig.class);
		
		var avaliado = contexto.getBean(Avaliador.class);
	
		avaliado.avaliar();
		
		contexto.close();
	}

}
