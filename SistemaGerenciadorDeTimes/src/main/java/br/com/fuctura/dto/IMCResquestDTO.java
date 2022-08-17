package br.com.fuctura.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IMCResquestDTO {
	private Double peso;
	private Double altura;
}
