package br.com.anderson.fiap;

import java.util.Scanner;

public class Exercicio4_1000a1999Resto5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o primeiro numero: ");
		int primeiroNumero = ler.nextInt();
		System.out.println("Informe até onde iremos: ");
		int segundoNumero = ler.nextInt();
		for (int i = primeiroNumero; i < segundoNumero; i++) {
			if (i % 11 == 5) {
				System.out.print(i+"-");
			}
		}
		System.out.println("Fim");
		ler.close();	
	}
}	
