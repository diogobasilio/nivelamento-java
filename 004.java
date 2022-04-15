/**Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
   código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/



import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroFuncionario, horasTrabalhadas;
		double valorHora, salario;

		System.out.println("Qual o número do funcionário? ");
		numeroFuncionario = sc.nextInt();
		System.out.println("Quantas horas trabalhadas? ");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Qual o valor da hora trabalhada? ");
		valorHora = sc.nextDouble();

		salario = valorHora * horasTrabalhadas;

		System.out.printf("NUMBER = %d\n", numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f\n", salario);

		sc.close();
	}

}
