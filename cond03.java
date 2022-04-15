/**Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
   Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
   ordem crescente ou decrescente.
**/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberA, numberB;

		System.out.println("Digite um número: ");
		numberA = sc.nextInt();
		System.out.println("Digite outro número: ");
		numberB = sc.nextInt();

		if (numberA % numberB == 0 || numberB % numberA == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são Multiplos");
		}

		sc.close();
	}
}
