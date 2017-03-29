package com.algaworks.cursojavaee;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("interesse")
public class InteresseConverter implements Converter{

	//converte o valor de um value de select para um objeto
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value != null) {
			for(Interesse interesse : PerfilUsuarioBean.INTERESSES) {
				if(value.equals(interesse.getNomeIcone())) {
					return interesse;
				}
			}
		}
		return null;
	}

	// envia o valor para a página xhtml
	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null) {
			Interesse interesse = (Interesse) value;
			return interesse.getNomeIcone();
		}
		
		return null;
	}
	
	

}