package br.com.teste.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.teste.service.CalculadoraPreco;


@Named("meuBean")
@SessionScoped
public class PrecoProdutoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private CalculadoraPreco calculadora;
	
	@PostConstruct
	public void init() {
		System.out.println("InitPrecoBean");
	}
	
	public double getPreco() {
		return calculadora.calcularPreco(4, 8);
	}
}
