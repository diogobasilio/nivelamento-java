import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valorA, valorB, valorC, valorD, diferenca;

		System.out.println("Digite o valor A:");
		valorA = sc.nextInt();
		System.out.println("Digite o valor B:");
		valorB = sc.nextInt();
		System.out.println("Digite o valor C:");
		valorC = sc.nextInt();
		System.out.println("Digite o valor D:");
		valorD = sc.nextInt();

		diferenca = valorA * valorB - valorC * valorD;

		System.out.printf("DIFERENÇA = %d\n", diferenca);

		sc.close();
	}

}
