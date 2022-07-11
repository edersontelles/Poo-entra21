package entidade;

public class Funcionario {

	private String nome;
	private double salario;
	private Endereco endereco;

	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, double salario, Endereco end) {
		this.nome = nome;
		this.salario = salario;
		this.endereco = end;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double calcularPagamento() {
		return this.getSalario() - this.calcularDesconto();
	}
	
	private double calcularDesconto() {
		//TODO usar uma constante para o desconto
		return this.getSalario() * 0.15;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
