package heranca;

public class Professor extends Pessoa{

	private String especialidade;
	private double salario;
	
	public void receberAum(double aum) {
		this.setSalario(this.getSalario() + aum);
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salário) {
		this.salario = salário;
	}
	
	
}
