package br.com.fuctura.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.fuctura.entidade.Jogador;
import br.com.fuctura.repository.JogadorRepository;

@Component
public class InicializadorBancoDeDados implements CommandLineRunner{

	@Autowired
	private JogadorRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		var j1 = new Jogador();
		j1.setNome("ronaldo");
		j1.setPeso(90.0);
		
		repo.save(j1);
	}

}
