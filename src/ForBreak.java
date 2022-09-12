
public class ForBreak {
	public static void main(String[] args) {

		int x = 1;
		int y = 90;
		int numeroAVerificar = 5;
		
		for (int i = x; i < y; i++) {
			if (i % 5 == 0) {
				System.out.printf("Achei um número (entre %s e %s) divisível por " + numeroAVerificar +": " + i, x, y);
				break;
			}
		}
	}
}
