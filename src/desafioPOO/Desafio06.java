package desafioPOO;

import java.util.Scanner;

public class Desafio06 {

	public static void main(String[] args) {
		String setence;
		int maior = 0;

		Scanner leTeclado = new Scanner (System.in);
		System.out.println("Digite uma frase: ");
		setence = leTeclado.nextLine();

		String quebra[] = setence.split(" ");  

		for ( int i = 0 ; i < quebra.length ; i++ ) {  

			if ( quebra[i].length() > quebra[maior].length() ) {  
				maior = i;  
			}  

		}  

		System.out.println("Maior palavra é:  "+quebra[maior]);
		leTeclado.close();

	}

}
