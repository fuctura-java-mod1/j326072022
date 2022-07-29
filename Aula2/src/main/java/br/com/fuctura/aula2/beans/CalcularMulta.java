package br.com.fuctura.aula2.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MULTA")
public class CalcularMulta  implements Calculadora {

	// construtor
	public CalcularMulta() {
		System.out.println("Construindo CalcularMulta");
	}

	public Double calcular(Double salario) {
		return salario + 12.00;
	}
}
