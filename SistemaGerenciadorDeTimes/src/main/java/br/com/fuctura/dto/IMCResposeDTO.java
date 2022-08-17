package br.com.fuctura.dto;

import lombok.Data;

@Data
public class IMCResposeDTO {
	private Double altura;
	private Double peso;
	private Double imc;
	private String mensagem;
}
