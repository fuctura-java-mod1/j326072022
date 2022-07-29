package br.com.fuctura.aula2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GeradorResumoGeral {
	
	private Calculadora gts;
	
	public GeradorResumoGeral(Calculadora calc) {
		this.gts = calc;
	}
	
	public void exibirResumo(Double  salario) {
		System.out.println(gts.calcular(salario));
	}
	
}
