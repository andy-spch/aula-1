package br.com.anderson.fiap;
import java.util.Random;

public class Sorteio {
	public static void main(String[] args) {
		Random r = new Random();
		int sorteado = r.nextInt(-2, 3);
		System.out.println(sorteado);
	}
}
