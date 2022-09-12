package br.com.anderson.fiap;
import java.util.Scanner;

public class ConversaoeSe {
	public static void main(String[] args) {
		
		byte a = 127;
		short b = 10;
		int resultado =  a + b;
		
		byte c = 10;
		byte d = 3;
		double divisao1 = c/d;  		// 3.0
		double divisao2 = (float) c/d;	// 3.333333
		
		System.out.println("RESULTADO: " + resultado);
		System.out.println("DIVISÃO 1: " + divisao1);
		System.out.println("DIVISÃO 2: " + divisao2);
		
		
		// SOLICITANDO INFORMAÇÕES PARA O USUÁRIO
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Informe o ano que você nasceu: ");
		int anoNascimento = scanner.nextInt();

		int resultante = 2022 - anoNascimento;
		
		if (resultante >= 18) {
			System.out.println("Nome: " + nome + "\nIdade: " + resultante + " você pode dirigir");
		} else if (resultante >= 16){
			System.out.println("Nome: " + nome + "\nIdade: " + resultante + " você não pode dirigir, mas pode votar");
		} else {
			System.out.println("Você não pode votar e nem dirigir");
		}
		
		scanner.close();

		
	}
}
