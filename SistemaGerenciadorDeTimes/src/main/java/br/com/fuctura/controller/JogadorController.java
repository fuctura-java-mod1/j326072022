package br.com.fuctura.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//java.awt.print.Pageable

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.fuctura.dto.IMCResposeDTO;
import br.com.fuctura.dto.IMCResquestDTO;
import br.com.fuctura.entidade.Jogador;
import br.com.fuctura.repository.JogadorRepository;

@RestController
public class JogadorController {

	@Autowired
	private JogadorRepository repo;
	
	@Autowired
	private RestTemplate cliente;

	@RequestMapping(path = "/jogador", method = RequestMethod.GET)
	public List<Jogador> findAll(
			@RequestParam(defaultValue = "0") Integer pageNo,
			@RequestParam(defaultValue = "10") Integer pageSize, 
			@RequestParam(defaultValue = "id") String sortBy) {
		
		Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy).ascending());
		
		Page<Jogador> pagedResult = repo.findAll(paging);
				
		if (pagedResult.hasContent()) {
			return pagedResult.getContent();
		} else {
			return new ArrayList<Jogador>();
		}
	}
	
	// http://localhost:8080/consultaexterna?min=10&max=90
	@RequestMapping(path = "/consultaexterna", method = RequestMethod.GET)
	public List<Jogador> utilizandoUmaConsultaExterna(@RequestParam("min") Double min,
			@RequestParam("max") Double max) {
		return repo.consultaExterna(min, max);
	}

	// http://localhost:8080/teste/ronaldo/90
	@RequestMapping(path = "/teste/{nome}/{peso}", method = RequestMethod.GET)
	public List<Jogador> getJogador(@PathVariable String nome, @PathVariable Double peso) {
		return repo.findJogadoresByNomeAndPeso(nome, peso);
	}

	// http://localhost:8080/teste?nome=ronaldo&peso=90
	@RequestMapping(path = "/teste", method = RequestMethod.GET)
	public List<Jogador> getJogador2(@RequestParam String nome, @RequestParam Double peso) {
		return repo.findJogadoresByNomeAndPeso(nome, peso);
	}

	// jogador/nome/ronaldo
	@RequestMapping(path = "/jogador/{id}", method = RequestMethod.GET)
	public Optional<Jogador> getJogador(@PathVariable Long id) {
		return repo.findById(id);
	}

	// http://localhost:8080/jogador/nome/ronaldo
	@RequestMapping(path = "/jogador/nome/{nome}", method = RequestMethod.GET)
	public List<Jogador> getJogador(@PathVariable String nome) {
		return repo.findJogadoresByNome(nome);
	}

	// http://localhost:8080/jogador

	// http://localhost:8080/jogador
	@RequestMapping(path = "/jogador", method = RequestMethod.POST)
	public void salvar(@RequestBody Jogador jogador) {
		
		//quero chamar a api do imc
		
		var req = IMCResquestDTO
				.builder()
				.altura(jogador.getAltura())
				.peso(jogador.getPeso())
				.build();
				
		var resp = cliente
				.postForObject("http://localhost:9045/calculadora/imc", 
						req, 
						IMCResposeDTO.class);
		
		System.out.println(resp);
		
		repo.save(jogador);
	}

	// http://localhost:8080/jogador/1
	@RequestMapping(path = "/jogador/{codigo}", method = RequestMethod.DELETE)
	public void excluir(@PathVariable("codigo") long cod) {
		repo.deleteById(cod);
	}
}
