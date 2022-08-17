package br.com.fuctura.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_jogador")
public class Jogador {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
	private String nome;
	private Double peso;
	private Double altura;
	private Double imc;
}