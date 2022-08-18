package heranca;

public class Principal {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Diogo");
		p4.setNome("Elizabete");
		
		p1.setSexo('M');
		p4.setSexo('F');
		
		p2.setCurso("Enfermagem");
		p3.setSalario(2500.75);

		
		p2.setCurso("Informática");
		p3.setSalario(2500.00);
		p4.setSetor("Estoque");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
		
				

	}

}
