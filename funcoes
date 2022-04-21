import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int high = max (a, b, c);
		
		showResult(high);

		sc.close();
	}
	
	public static int max(int x, int y, int z) { //com retorno
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {  // sem retorno
		System.out.println("Higher = " + value);
	}
	
}
