package br.com.anderson.fiap;

public class ForContinue {
	/**
	 * O código não vai imprimir alguns números. (Quais exatamente?)
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i > 50 && i < 60) {
				continue;  // ele passa reto
			}
			System.out.println(i);	
		}
	}
}
