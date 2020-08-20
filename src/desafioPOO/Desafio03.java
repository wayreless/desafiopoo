package desafioPOO;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		String setence; 
		int total = 0;

		Scanner leTeclado = new Scanner(System.in); 
		System.out.println("Digite uma frase: " );
		setence = leTeclado.nextLine();

		for(int i = 0; i < setence.length(); i++){
			if(setence.charAt(i)== 'a'){
				total = total+1;
			}
		}
		System.out.println("O total de letras 'A' nesta frase é " + total);
		
		leTeclado.close();

	}

}
