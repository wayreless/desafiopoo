package desafioPOO;

public class Desafio01 {

	public static void main(String[] args) {
		double sum = 1;
		double qdt = 1;
			for (int home = 1; home <= 64; home++) {
			System.out.println("Casa: " + home + " - Qtd: " + qdt + "- Soma: " + sum);
			qdt = qdt*2;
			sum = sum + qdt;
			}
	}

}
