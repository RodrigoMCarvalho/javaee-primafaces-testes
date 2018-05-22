package br.com.teste.testes;

import java.util.Iterator;
import java.util.Set;

public class TesteCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Domindo Coleções do Java 8", "Gustavo Moreira");
		System.out.println(javaColecoes);
		
		javaColecoes.adicionar(new Aula("Relacionamento entre Coleções", 23));
		javaColecoes.adicionar(new Aula("Criando uma aula", 21));
		javaColecoes.adicionar(new Aula("Trabalhando com Lists", 19));
		
		Aluno a1 = new Aluno("Rodrigo Moreira", 457878);
		Aluno a2 = new Aluno("Raquel Carvalho", 854878);
		Aluno a3 = new Aluno("Ailton da Silva", 854887);
		Aluno a4 = new Aluno("Logan", 159987);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		while(iterador.hasNext()) {
			Aluno proxino = iterador.next();
			System.out.println(proxino);
		}
		
//      System.out.println(javaColecoes.getAlunos());
		
//		javaColecoes.getAlunos().forEach(aluno -> {
//			System.out.println(aluno);
//		});
//		
		//System.out.println(javaColecoes.estaMatriculado(a4));
		
		Aluno rodrigo = new Aluno("Rodrigo Moreira", 457878);
		
		System.out.println(a1.equals(rodrigo));
		
		System.out.println(a1.hashCode() == rodrigo.hashCode());
		
	}
	
}
