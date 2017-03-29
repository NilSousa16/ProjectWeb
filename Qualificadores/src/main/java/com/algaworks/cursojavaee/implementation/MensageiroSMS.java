package com.algaworks.cursojavaee.implementation;

import com.algaworks.cursojavaee.qualifier.Urgente;
import com.algaworks.cursojavaee.service.Mensageiro;

@Urgente
public class MensageiroSMS implements Mensageiro{

	@Override
	public void enviarMensagem(String texto) {
		System.out.println("Enviando mensagem por SMS: " + texto);
	}
	
}
