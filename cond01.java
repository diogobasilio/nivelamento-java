/**Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("Digite um número: ");
		number = sc.nextInt();

		if (number < 0) {
			System.out.println("O número é negativo.");
		} else {
			System.out.println("O número é positivo.");
		}
	}
}
