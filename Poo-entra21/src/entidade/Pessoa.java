package entidade;

import java.util.ArrayList;

public abstract class Pessoa {

	private String nome;
	private boolean adimplente;
	
	private ArrayList<Conta> contas[];
	
	public Pessoa() {
		super();
		this.adimplente = true;
	}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
		this.adimplente = true;
	}
	
	public abstract String getApelido();
	
	public abstract boolean verificarAdimplente();	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
