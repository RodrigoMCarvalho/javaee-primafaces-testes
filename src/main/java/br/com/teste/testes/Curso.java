package br.com.teste.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> alunoMatriculado = new HashMap<>();
	//mapear dado um número(matrícula) um aluno correspondente

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.alunoMatriculado.put(aluno.getNumeroMatricula(), aluno);
	}

	public Curso() {

	}
	
	public void adicionar(Aula aula) {
		aulas.add(aula);
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public Set<Aluno> getAlunos() {
		return alunos;
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", instrutor = " + instrutor + "]";
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaPorMatriculo(int numero) {
		
		if (!alunoMatriculado.containsKey(numero)) {
			throw new NoSuchElementException("Matrícula não encontrada.");
		}	
		return alunoMatriculado.get(numero);
		
//		for (Aluno aluno : alunos) {
//			if (aluno.getNumeroMatricula() == numero) {
//				return aluno;
//			}
//		}
//		 throw new NoSuchElementException("matricula não encontrada.");
	}

}
