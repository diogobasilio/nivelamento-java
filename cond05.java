/**Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
   seguir, calcule e mostre o valor da conta a pagar.
**/


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quantidade, codigoItem;
		double valorPagar;

		System.out.println("Informe o código do item: ");
		codigoItem = sc.nextInt();
		System.out.println("Informe a quantidade do item: ");
		quantidade = sc.nextInt();

		if (codigoItem == 1 || codigoItem == 2) {
			valorPagar = 4.50 * quantidade;
			System.out.printf("Total: %.2f\n", valorPagar);
		} else if (codigoItem == 3) {
			valorPagar = 5.00 * quantidade;
			System.out.printf("Total: %.2f\n", valorPagar);
		} else if (codigoItem == 4) {
			valorPagar = 2.00 * quantidade;
			System.out.printf("Total: %.2f\n", valorPagar);
		} else if (codigoItem == 5) {
			valorPagar = 1.50 * quantidade;
			System.out.printf("Total: %.2f\n", valorPagar);
		} else {
			System.out.println("Código inválido");
		}

		sc.close();
	}
}
