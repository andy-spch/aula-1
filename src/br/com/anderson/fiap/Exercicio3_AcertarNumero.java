package br.com.anderson.fiap;
import java.util.Random;
import java.util.Scanner;

public class Exercicio3_AcertarNumero {
	public static void main(String[] args) {
		Random r = new Random();
		int numeroBuscado = r.nextInt(0, 11);
		short palpite = 0;
		while (numeroBuscado != palpite) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("Informe um número: ");
			palpite = leitor.nextShort();
			if (numeroBuscado < palpite) {
				System.out.println("O valor é menor! Tente novamente.");
			} else if (numeroBuscado > palpite){
				System.out.println("O valor é maior! Tente novamente.");
			} else {
				leitor.close();
				System.out.printf("Parabéns você acertou o valor correto é %s!\n", numeroBuscado);
			}
		}
	}
}
