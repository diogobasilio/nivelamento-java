package aula02;

public class Aula02 {

	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		c1.modelo = "BIC";
		c1.cor = "Azul";
		c1.ponta = 0.5;
		c1.carga = 50;
		//c1.status();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Comum";
		c2.cor = "Vermelha";
		c2.ponta = 1.5;
		c2.carga = 80;
		//c2.status();
		
		Cardeneta cd = new Cardeneta();
		
		cd.capa = true;
		cd.folhas = 350;
		cd.impressao = "3D";
		cd.calendario = 2022;
		//cd.status();
		
		AprenderViolao ap = new AprenderViolao();
		
		ap.tempoDeEstudo = 4.50;
		ap.metodo = "Vídeo Aula";
		ap.diasPorSemana = 4;
		ap.violao = true;
		ap.status();
		
		
	}

}
