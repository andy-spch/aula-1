
public class Booleanos {
	public static void main(String[] args) {
		int numero = 10;
		
		boolean teste1 = numero > 5;	// maior	
		boolean teste2 = numero < 5;	// menor
		boolean teste3 = numero >= 10;	// maior ou igual
		boolean teste4 = numero <= 5;	// menor ou igual
		boolean teste5 = numero == 5;	// igual
		boolean teste6 = numero != 10;	// diferente
		// as duas verificações tem que ser verdadeiras
		boolean teste7 = numero > 1 && numero < 11;	// e
		// uma ou outra deve ser verdadeira
		boolean teste8 = numero > 1 || numero < 11;	// ou
		boolean teste9 = numero > 1 || numero > 11; // dará True
		boolean teste10 = numero < 1 || numero > 11; // dará False

		System.out.println("Teste 1: " + teste1);
		System.out.println("Teste 2: " + teste2);
		System.out.println("Teste 3: " + teste3);
		System.out.println("Teste 4: " + teste4);
		System.out.println("Teste 5: " + teste5);
		System.out.println("Teste 6: " + teste6);
		System.out.println("Teste 7: " + teste7);
		System.out.println("Teste 8: " + teste8);
		System.out.println("Teste 9: " + teste9);
		System.out.println("Teste 10: " + teste10);
				
	}
}
