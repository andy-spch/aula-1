import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a velocidade do carro: ");
		int velocidadeCarro = leitor.nextInt();
		System.out.println("Informe a velocidade da via: ");
		int velocidadeVia = leitor.nextInt();
		leitor.close();
		int resultado = velocidadeCarro-velocidadeVia;
		if (resultado > 30) {
			System.out.println("Pagar R$300,00");
		}else if(resultado >= 11) {
			System.out.println("Pagar R$100,00");
		}else if(resultado > 0) {
			System.out.println("Pagar R$50,00");
		}else if(velocidadeCarro == 0){
			System.out.println("O carro está parado"); 
		}else {
			System.out.println("O carro está dentro do limite da via!");
		}
		
	}
}
