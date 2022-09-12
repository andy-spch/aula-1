package br.com.anderson.fiap;

public class Incremento {
	public static void main(String[] args) {
		// EXEMPLO 1
		int i = 5;
		// primeiro eu atribuo o valor de i para a variável x e depois
		// eu somo o valor de i
		int x = i++; // x vale 5, pois é o valor de i que veio primeiro
		System.out.println(x);
		
		
		//EXEMPLO 2
		int j = 10;
		// Neste caso, primeiro é somado o valor de j para depois ser realizada a
		// passagem de valor para a variável z;
		int z = ++j;
		
		System.out.println(z);
		
		
		// EXEMPLO 3
		int k = 100;
		// Mesma coisa que o exemplo 1
		int l = k--; // printa 100
		
		System.out.println(l);
		
		// EXEMPLO 4
		int n = 100;
		int m = --n;
		
		System.out.println(m);
		
	}
}
