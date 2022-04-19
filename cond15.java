
/**  Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
  * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
  * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
  */ 

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int in = 0, valor = 0, out = 0;

		for (int i = 0; i < N; i++) {

			valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {
				in += 1;
			}
		}

		out = N - in;

		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);

		sc.close();
	}
}
