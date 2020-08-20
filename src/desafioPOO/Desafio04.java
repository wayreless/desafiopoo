package desafioPOO;

import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {
		String setence;

		Scanner leTeclado = new Scanner (System.in);
		System.out.println("Digite uma frase: ");
		setence = leTeclado.nextLine();

		String quebra[] = setence.split(" ");  

	  System.out.println("O total de palavras nesta frase é " + quebra.length);
	  
	  leTeclado.close();

	}

}
