
/**	Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
  * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
  * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
  */

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int pass;

		System.out.println("Digite a senha: ");
		pass = sc.nextInt();

		while (pass != 2002) {
			System.out.println("Senha Inválida");
			pass = sc.nextInt();
		}

		System.out.println("Acesso Permitido");

		sc.close();
	}
}
