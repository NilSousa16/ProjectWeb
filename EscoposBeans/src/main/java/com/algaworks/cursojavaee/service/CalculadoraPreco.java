package com.algaworks.cursojavaee.service;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

@RequestScoped
//@Dependent // está notação faz com que esse bean se torne dependende de quem o
			// chama, ou seja, usa o mesmo escopo de quem chamou
public class CalculadoraPreco {

	@PostConstruct
	public void init() {
		System.out.println("Init CalculadoraPreco");
	}

	public double calcularPreco(int quantidade, double precoUnitario) {
		return quantidade * precoUnitario;
	}
}
