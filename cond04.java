/**Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
   começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
**/


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int horaInicial, horaFinal, tempo = 0;

		System.out.println("Digite a hora inicial: ");
		horaInicial = sc.nextInt();
		System.out.println("Digite a hora final: ");
		horaFinal = sc.nextInt();

		if (horaInicial == 0 && horaFinal == 0) {
			tempo = 24;
			System.out.printf("O JOGO DUROU %d HORA(S)", tempo);
		} else if (horaInicial > horaFinal) {
			tempo = 24 - horaInicial + horaFinal;
			System.out.printf("O JOGO DUROU %d HORA(S)", tempo);
		} else {
			tempo = horaFinal - horaInicial;
			System.out.printf("O JOGO DUROU %d HORA(S)", tempo);
		}

		sc.close();
	}
}
