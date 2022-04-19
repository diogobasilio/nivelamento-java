
/**	Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
  * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
  * menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
  */

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Digite a coordenada X: ");
		x = sc.nextInt();
		System.out.println("Digite a coordenada Y: ");
		y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
				System.out.println();
				System.out.println("Digite a coordenada X: ");
				x = sc.nextInt();
				System.out.println("Digite a coordenada Y: ");
				y = sc.nextInt();
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
				System.out.println();
				System.out.println("Digite a coordenada X: ");
				x = sc.nextInt();
				System.out.println("Digite a coordenada Y: ");
				y = sc.nextInt();
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
				System.out.println();
				System.out.println("Digite a coordenada X: ");
				x = sc.nextInt();
				System.out.println("Digite a coordenada Y: ");
				y = sc.nextInt();
			} else {
				System.out.println("Quarto");
				System.out.println();
				System.out.println("Digite a coordenada X: ");
				x = sc.nextInt();
				System.out.println("Digite a coordenada Y: ");
				y = sc.nextInt();
			}
		}

		sc.close();
	}
}
