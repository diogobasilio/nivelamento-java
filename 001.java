/**Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
   mensagem explicativa, conforme exemplos.*/



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1, valor2, soma;

		System.out.println("Digite o primero valor: ");
		valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = sc.nextInt();

		soma = valor1 + valor2;

		System.out.printf("SOMA = %d\n", soma);

		sc.close();
	}

}
