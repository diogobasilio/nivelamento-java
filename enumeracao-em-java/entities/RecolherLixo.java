package entities;

import entities.enumsJava.DiaSemana;

public class RecolherLixo {

    private DiaSemana dia;

    public RecolherLixo(String dia) {
        this.dia = DiaSemana.valueOf(dia);
    }

    //Os dias de coleta são segunda, quarta e sexta
    public void DiaDaColeta() {
        switch (this.dia) {
            case SEGUNDA:
                System.out.println("Hoje passará coleta, coloqe o lixo para fora.");
                break;
            case QUARTA:
                System.out.println("Hoje passará coleta, coloqe o lixo para fora.");
                break;
            case SEXTA:
                System.out.println("Hoje passará coleta, coloqe o lixo para fora.");
                break;
            default:
                System.out.println("Sinto muito, hoje não é dia de coleta.");
        }
    }


}
