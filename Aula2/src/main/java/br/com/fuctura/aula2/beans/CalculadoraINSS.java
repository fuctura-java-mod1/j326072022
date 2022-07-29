package br.com.fuctura.aula2.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("INSS")
public class CalculadoraINSS implements Calculadora {

	// construtor
	public CalculadoraINSS() {
		System.out.println("Construindo CalculadoraINSS");
	}

	public Double calcular(Double salario) {
		return salario + 11.00;
	}
}
