package br.com.anderson.fiap;
import java.util.Scanner;

public class Exercicio2_AnoBissexto {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe algum ano: ");
		int ano = leitor.nextInt();
		
		// Condicao para ser considerado bissexto - Podemos colocar em uma vari·vel
		// boolean condicao = ano % 400 == 0 || (ano % 4 == 0 && 100 != 0);
		if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.printf("O ano %s, È bissexto.", ano);
		}else {
			System.out.printf("O ano %s, n√£o È bissexto", ano);
		}
		leitor.close();
	}
}
