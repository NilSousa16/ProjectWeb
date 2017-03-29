package com.algaworks.cursojavaee.implementation;

import javax.enterprise.inject.Default;

import com.algaworks.cursojavaee.service.Mensageiro;

@Default
public class MensageiroCorreio implements Mensageiro{

	@Override
	public void enviarMensagem(String texto) {
		System.out.println("Enviando mensagem por correios: " + texto);
	}
	
}
