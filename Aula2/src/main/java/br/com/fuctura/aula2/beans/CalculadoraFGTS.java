package br.com.fuctura.aula2.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//segunda de declarar o bean utilizar @Component
@Component
//@Primary
@Qualifier("FGTS")
public class CalculadoraFGTS implements Calculadora {
	
	//construtor
	public CalculadoraFGTS() {
		System.out.println("Construindo CalculadoraFGTS");
	}
	
	public Double calcular(Double salario) {
		return salario + 10.00;
	}
}
