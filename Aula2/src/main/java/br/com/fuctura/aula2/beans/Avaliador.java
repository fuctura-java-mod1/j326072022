package br.com.fuctura.aula2.beans;

import org.apache.commons.rng.UniformRandomProvider;
import org.springframework.stereotype.Component;

@Component
public class Avaliador {
	
	private Atividade at1;
	private Atividade at2;
	private UniformRandomProvider rng;
	
	public void avaliar() {
		at1.questao("Questão 1");
		at2.questao("Questão 2");
		var nota = gerarNotaAleatoria();
		System.out.println("Sua nota foi: " + nota);
	}
	
    public int gerarNotaAleatoria() {
        return 1 + rng.nextInt(10);
    }
	
}
