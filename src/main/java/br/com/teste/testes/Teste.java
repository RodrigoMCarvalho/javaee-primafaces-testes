package br.com.teste.testes;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a nota 1: ");
		int n1 = scan.nextInt();
		System.out.print("Digite a nota 2: ");
		int n2 = scan.nextInt();
		
		double media = (n1 + n2)/2;
		
		System.out.println("Sua média foi " + media);
		
	}

}
