package desafioPOO;

public class Desafio07 {

	public static void main(String[] args) {
		int impar =0;
		int par = 0;

		for(int n = 1; n <= 50; n++) {
		
			if(n % 2 == 0) {
				par += n;

			} else {                                         
				impar += n;
			}
		}
			System.out.println("O fatorial do n�mero resultado da subtra��o da soma dos n�meros pares "
					+ "pela soma dos n�meros �mpares existentes no intervalo entre [1 e 50] � : " + fatorial(par - impar));

		}

		public static double fatorial(int number) {
			if (number <= 1) {

				return 1;

			} else {

				return fatorial(number - 1) * number;

			}
			
		}
}
