package aula04;

public class Caneta {

	private String modelo;
	private String cor;
	private double ponta;
	private boolean tampada;
	private boolean destampada;
	public Caneta(String modelo, String cor) {
		super();
		this.modelo = modelo;
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPonta() {
		return ponta;
	}
	public void setPonta(double ponta) {
		this.ponta = ponta;
	}
	public boolean isTampada() {
		return tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	public boolean isDestampada() {
		return destampada;
	}
	public void setDestampada(boolean destampada) {
		this.destampada = destampada;
	}
	
	public void status() {
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor : " + this.getCor());
		System.out.println("Está tampado? " + this.tampada);
	}
	
	

}
