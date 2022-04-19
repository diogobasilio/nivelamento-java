/**  Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
  *  segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
  */

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int parA, parB;
		double divisao;

		for (int i = 0; i < N; i++) {
			parA = sc.nextInt();
			parB = sc.nextInt();
			if (parB == 0) {
				System.out.println("divisão impossível");
			} else {
				divisao = (double) parA / parB;
				System.out.printf("%.1f\n", divisao);
			}
		}

		sc.close();
	}
}
