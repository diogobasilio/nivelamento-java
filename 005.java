/**Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
   código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codPeca1, numPeca1, codPeca2, numPeca2;
		double valorUnitario1, valorUnitario2, valorTotal;

		System.out.println("Informe o código da peça 1: ");
		codPeca1 = sc.nextInt();
		System.out.println("Informe a quantidade de peças 1: ");
		numPeca1 = sc.nextInt();
		System.out.println("Seu valor unitário: ");
		valorUnitario1 = sc.nextDouble();

		System.out.println("Informe o código da peça 2: ");
		codPeca2 = sc.nextInt();
		System.out.println("Informe a quantidade de peças 2: ");
		numPeca2 = sc.nextInt();
		System.out.println("Seu valor unitário: ");
		valorUnitario2 = sc.nextDouble();

		valorTotal = numPeca1 * valorUnitario1 + numPeca2 * valorUnitario2;

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

		sc.close();
		
	}

}
