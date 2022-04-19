
/**	Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
  * um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
  * 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
  * que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
  * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
  * exemplo.
  */


import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, alcool = 0, gasolina = 0, diesel = 0;

		System.out.println("Digite de 1 a 4 o tipo do combustível: ");
		x = sc.nextInt();

		while (x != 4) {

			switch (x) {
			case 1:
				alcool += 1;
				System.out.println("Digite de 1 a 4 o tipo do combustível: ");
				x = sc.nextInt();
				break;
			case 2:
				gasolina += 1;
				System.out.println("Digite de 1 a 4 o tipo do combustível: ");
				x = sc.nextInt();
				break;
			case 3:
				diesel += 1;
				System.out.println("Digite de 1 a 4 o tipo do combustível: ");
				x = sc.nextInt();
				break;
			default:
				System.out.println("Inválido. Digite novamente.");
				x = sc.nextInt();
			}
		}

		System.out.printf("MUITO OBRIGADO!\n Alcool: %d\n Gasolina: %d\n Diesel: %d\n", alcool, gasolina, diesel);

		sc.close();
	}
}
