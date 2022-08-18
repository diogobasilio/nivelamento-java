package application;

import entities.RecolherLixo;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RecolherLixo lixo;

        System.out.println("Por favor, informe o dia da semana: ");
        String dia = sc.nextLine().toUpperCase();
        lixo = new RecolherLixo(dia);

        lixo.DiaDaColeta();








        sc.close();
    }

}
