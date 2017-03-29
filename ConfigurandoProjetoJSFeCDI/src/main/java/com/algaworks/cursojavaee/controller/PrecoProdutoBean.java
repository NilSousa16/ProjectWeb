package com.algaworks.cursojavaee.controller;

import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.cursojavaee.service.CalculadoraPreco;

@Named("meuBean") //indica que o bean terá uma representação na EL
public class PrecoProdutoBean {
	
	@Inject //injeta a dependência necessária sem a necessidade de instanciar, diminuindo, assim, o acoplamento
	private CalculadoraPreco calculadora;

	public double getPreco() {
		return calculadora.calcularPreco(12, 44.55);
	}
	
}
