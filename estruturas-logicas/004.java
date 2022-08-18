/**Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/


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
