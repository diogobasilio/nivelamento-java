/**  Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
  * começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
  * exemplo.
  */


import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 1, b = 1, c = 0;

		for (int i = 1; i <= n; i++) {
			a = i;
			b = i * i;
			c = i * i * i;
			System.out.print(a + " ");
			System.out.print(b + " ");
			System.out.println(c + " ");

		}

		sc.close();
	}
}
