package br.com.teste.service;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;


@RequestScoped
public class CalculadoraPreco {

	public double calcularPreco(int quantidade, double precoUnitario) {
		return quantidade*precoUnitario;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("InitCalculadoraPreco");
	}
}
