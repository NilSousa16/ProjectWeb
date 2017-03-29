package com.algaworks.cursojavaee.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.cursojavaee.service.CalculadoraPreco;

@Named("meuBean")
@RequestScoped
public class PrecoProdutoBean {

	// três formas de injeção de um bean através de CDI

	// @Inject - injeção através da variável
	private CalculadoraPreco calculadora;

	@Inject //- injeção através do método set
	public void setCalculadora(CalculadoraPreco calculadora) {
		this.calculadora = calculadora;
	}

	// injeção através do construtor, necessita do construtor padrão e do
	// construtor para o CDI
//	public PrecoProdutoBean() {
//	}
//
//	@Inject
//	public PrecoProdutoBean(CalculadoraPreco calculadora) {
//		this.calculadora = calculadora;
//	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init PrecoProdutoBean");
	}

	public double getPreco() {
		return calculadora.calcularPreco(12, 44.55);
	}

}
