/**Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
   de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valorA, valorB, valorC, valorD, diferenca;

		System.out.println("Digite o valor A:");
		valorA = sc.nextInt();
		System.out.println("Digite o valor B:");
		valorB = sc.nextInt();
		System.out.println("Digite o valor C:");
		valorC = sc.nextInt();
		System.out.println("Digite o valor D:");
		valorD = sc.nextInt();

		diferenca = valorA * valorB - valorC * valorD;

		System.out.printf("DIFERENÇA = %d\n", diferenca);

		sc.close();
	}

}
