package br.com.fuctura.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.fuctura.entidade.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long> {
	
	public List<Jogador> findJogadoresByNomeAndPeso(String nome, Double peso);
	
	// findBy#
	public Optional<Jogador> findJogadorByNome(String nome);

	// find$By# $ => Distict, Top ou First qualquer coisa diferente é ignorado
	public List<Jogador> findJogadoresByNome(String nome);
	
	// findDistinct#By#
	public List<Jogador> findDistinctJogadoresByNome(String nome);
	
	// find#By#IgnoreCase
	public List<Jogador> findJogadoresByNomeIgnoreCase(String nome);
	
	// find#By#OrderBy#[Asc|Desc]
	public List<Jogador> findJogadoresByNomeOrderByNomeDesc(String nome);
	
	public List<Jogador> findJogadoresByNomeAndPesoOrderByNomeDesc(String nome, Double peso);
	
	@Query(name = "Jogador.consultarPorPeso")
	public List<Jogador> consultaExterna(@Param(value = "min") Double minimo, @Param(value = "max") Double maximo);
	
	@Query(value = "SELECT J FROM Jogador J WHERE peso BETWEEN :min AND :max")
	public List<Jogador> consultaUtilizandoJPQL(@Param(value = "min") Double minimo, @Param(value = "max") Double maximo);
}