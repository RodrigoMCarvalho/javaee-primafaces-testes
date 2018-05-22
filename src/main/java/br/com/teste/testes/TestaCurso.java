package br.com.teste.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Domindo Coleções do Java 8", "Gustavo Moreira");
		System.out.println(javaColecoes);
		
		javaColecoes.adicionar(new Aula("Relacionamento entre Coleções", 23));
		javaColecoes.adicionar(new Aula("Criando uma aula", 21));
		javaColecoes.adicionar(new Aula("Trabalhando com Lists", 19));
		System.out.println(javaColecoes.getAulas());
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
	
	}
}
