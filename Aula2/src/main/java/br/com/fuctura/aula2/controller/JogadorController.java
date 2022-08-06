package br.com.fuctura.aula2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.aula2.entidade.Jogador;

@RestController
public class JogadorController {
	
	//http://localhost:9081/jogador
	@RequestMapping(path = "/jogador",  method = RequestMethod.GET)
	public List<Jogador> getJogador(){
		var j1 = new Jogador();
		j1.setNome("Messi");
		j1.setPeso(90.0);
		
		return List.of(j1);		
	}
	
	//http://localhost:9081/contrato/estudo
	@RequestMapping(path = "/contrato/estudo",  method = RequestMethod.GET)
	public Jogador getJogador2(){
		var j1 = new Jogador();
		j1.setNome("CR7");
		j1.setPeso(90.0);
		
		return j1;		
	}
	
	/*
	{
	    "nome": "Rodrigo",
	    "peso": 1.7	
	}
	*/
	//http://localhost:9081/jogador
	@RequestMapping(path = "/jogador", method = RequestMethod.POST)
	public void salvar(@RequestBody Jogador jogador) {
		System.out.println(jogador.toString());
	}
	
	//http://localhost:9081/jogador/{id}
	//http://localhost:9081/jogador/1
	//http://localhost:9081/jogador/2
	@RequestMapping(path = "/jogador/{codigo}", method = RequestMethod.DELETE)
	public void excluir(@PathVariable("codigo") int cod) {
		System.out.println(cod);
	}
}
