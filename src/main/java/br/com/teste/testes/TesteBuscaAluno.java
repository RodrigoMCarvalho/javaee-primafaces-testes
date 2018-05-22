package br.com.teste.testes;

public class TesteBuscaAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Domindo Coleções do Java 8", "Gustavo Moreira");
		System.out.println(javaColecoes);

		javaColecoes.adicionar(new Aula("Relacionamento entre Coleções", 23));
		javaColecoes.adicionar(new Aula("Criando uma aula", 21));
		javaColecoes.adicionar(new Aula("Trabalhando com Lists", 19));

		Aluno a1 = new Aluno("Rodrigo Moreira", 457878);
		Aluno a2 = new Aluno("Raquel Carvalho", 854878);
		Aluno a3 = new Aluno("Ailton da Silva", 854887);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno da matrícula 854887 ?");
		Aluno encontrado = javaColecoes.buscaPorMatriculo(854887);
		System.out.println(encontrado);
		
		

	}

}
