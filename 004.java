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
