
public class Tipos {
	public static void main(String[] args) {
		String mensagem = "Olá, Mundo!";
		System.out.println(mensagem);
		String nome = "Meu nome é Anderson";
		System.out.println(nome);
		short idade = 30;
		System.out.println(idade);
		System.out.println(mensagem + nome + "e possuo " + idade + " anos.");
		
		
		
		// AGORA SOBRE VARIÁVEIS:
		byte tamanhoMinimoByte = Byte.MIN_VALUE;
		byte tamanhoByte = Byte.MAX_VALUE;		// 2^8 -128 até 127
		short tamanhoMinimoShort = Short.MIN_VALUE;
		short tamanhoShort = Short.MAX_VALUE;	// 2^16 
		int tamanhoMinimoInt = Integer.MIN_VALUE;
		int tamanhoInt = Integer.MAX_VALUE;		// 2^16
		long tamanhoMinimoLong = Long.MIN_VALUE;
		long tamanhoLong = Long.MAX_VALUE;		// 2^64
		
		System.out.println("******************* Inteiros ************************");
		System.out.println("byte cabe de " + tamanhoMinimoByte + " até: " + tamanhoByte);
		System.out.println("short cabe de " + tamanhoMinimoShort + " até: " + tamanhoShort);
		System.out.println("int cabe de " + tamanhoMinimoInt + " até: " + tamanhoInt);
		System.out.println("long cabe de " + tamanhoMinimoLong + " até: " + tamanhoLong);
		
		// NÚMEROS DE PONTO FLUTUANTE
		float tamanhoMinimoFloat = Float.MIN_VALUE;
		float tamanhoMaximoFloat = Float.MAX_VALUE;		//
		double tamanhoMinimoDouble = Double.MIN_VALUE;
		double tamanhoMaximoDouble = Double.MAX_VALUE;	//
		
		System.out.println("******************* Pontos Flutuantes ************************");
		System.out.println("float cabe de " + tamanhoMinimoFloat + "até " + tamanhoMaximoFloat);
		System.out.println("double cabe de " + tamanhoMinimoDouble + "até " + tamanhoMaximoDouble);
		
		// Valores lógicos
		boolean verdadeiro = true;  // ou false, se não for iniciado, false é o valor padrão.
		// Caracteres, que devem ser escritos com aspas simples.
		char caractere = 'a';
		// textos de variados tamanhos.
		String texto = "Este aqui recebe textos";
		
		System.out.println(verdadeiro);
		System.out.println(caractere);
		System.out.println(texto);
		
		
		System.out.printf("%s esse é o texto %s %s %s %s", "Item", tamanhoInt, tamanhoMaximoDouble, 22, tamanhoMinimoShort);
		
		System.out.printf("\n%s", 10000);
		
	}
	
	
}
