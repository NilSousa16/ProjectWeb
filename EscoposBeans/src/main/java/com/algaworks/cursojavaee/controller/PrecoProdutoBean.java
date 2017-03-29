package com.algaworks.cursojavaee.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.cursojavaee.service.CalculadoraPreco;

@Named("meuBean") // indica que o bean terá uma representação na EL
@SessionScoped
// Escopos Beans CDI
// @Dependent - escopo padrão do cdi
// @RequestScoped
// @SessionScoped
// @ApplicationScoped
// @ConversationScoped --similar a um escopo de sessão, no entanto, pode-se
// controlar o seu início e fim
public class PrecoProdutoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	@Inject // injeta a dependência necessária sem a necessidade de instanciar,
			// diminuindo, assim, o acoplamento
	private CalculadoraPreco calculadora;

	@PostConstruct // utilizado no lugar do construtor para realizar algum
					// processamento após a instanciação do Bean e da injeção
					// correta das dependências
	public void init() {
		System.out.println("Init PrecoProdutoBean");
	}

	public double getPreco() {
		return calculadora.calcularPreco(12, 44.55);
	}

}
