package desafioPOO;

import java.util.Scanner;

public class Desafio08 {

	public static void main(String[] args) {
		double x, x1, x2;
		int a, b, c;
		
		Scanner leTeclado = new Scanner(System.in); 
		
		System.out.println( "Digite o valor de a: " );
		a = leTeclado.nextInt();

		System.out.println( "Digite o valor de b: " );
		b = leTeclado.nextInt();
		
		System.out.println( "Digite o valor de c: " );
		c = leTeclado.nextInt();
		
		x = Math.pow (b,2) - 4 * a * c;
		x1 = (-b + Math.sqrt(x)) / (2 * a);
		x2 = (-b - Math.sqrt(x)) / (2 * a);
		
		System.out.println("O valor de X1 = " + x1);
		System.out.println("O valor de X2 = " + x2);
		
	   leTeclado.close();

	}

}
