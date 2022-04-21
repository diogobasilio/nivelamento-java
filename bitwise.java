/**  Os operadores bitwise são aqueles operadores que realizam operações lógicas bit a bit em valores.
 *   sendo mais utilizados em baixo nível, como arduíno, micro controleador, programação de interface com rede.
 */


import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0 ) {
			System.out.printf("O 6° bit de %d é true", n);
		} else {
			System.out.printf("O 6° bit de %d é false", n);
		}
		
		sc.close();
	}
}
