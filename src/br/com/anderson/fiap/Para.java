package br.com.anderson.fiap;

public class Para {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i = i + 1) {
			System.out.println("Oi " + i);
		}
		
		
		// é equivalente as linhas abaixo
		int i = 0;
		while (i < 10) {
			System.out.println("Novo Oi " + i);
			i = i + 1;
		}
	}
}
