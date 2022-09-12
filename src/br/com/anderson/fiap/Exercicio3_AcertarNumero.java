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
			System.out.println("Informe um n�mero: ");
			palpite = leitor.nextShort();
			if (numeroBuscado < palpite) {
				System.out.println("O valor � menor! Tente novamente.");
			} else if (numeroBuscado > palpite){
				System.out.println("O valor � maior! Tente novamente.");
			} else {
				leitor.close();
				System.out.printf("Parab�ns voc� acertou o valor correto � %s!\n", numeroBuscado);
			}
		}
	}
}
