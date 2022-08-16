package model.entidade;

public class Gerente extends Funcionario {
	
	private String setor;

	public Gerente(String nome, double salario, Endereco end) {
		super(nome, salario, end);
	}
	
	public Gerente(String nome, double salario, String setor, Endereco end) {
		super(nome, salario, end);
		this.setor = setor;
	}

	@Override
	public double calcularPagamento() {
		return super.calcularPagamento() + this.calcularComissao();
	}
	
	private double calcularComissao() {
		//TODO usar uma constante para o desconto
		
		//Salário é o salário bruto
		return this.getSalario() * 0.25;
	}

	@Override
	public String getNome() {
		return super.getNome() + " (gerente do setor " + this.setor + ")";
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
}
