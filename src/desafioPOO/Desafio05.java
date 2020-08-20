package desafioPOO;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {
		
		Scanner leTeclado = new Scanner(System.in);
		System.out.println("Digite o valor de N: ");
		
		int a;
		int b;
		int i;
		int n;
		n = leTeclado.nextInt();

			for(a = 1, b = 1, i = 0; i<n; b+=a, a=b-a, i++) {
			System.out.print(a + " ");
				
			leTeclado.close();
		}

	}

}
