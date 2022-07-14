package entidade;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}
	
	@Override
	public String getApelido() {
		return this.getNome() + " LTDA";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public boolean verificarAdimplente() {
		
		double saldoGeral = 0;
		
		for (int i = 0; i < getContas().size(); i++) {
			saldoGeral += getContas().get(i).getSaldo();
		}
		
		setAdimplente(false);
		
		if(saldoGeral > -1000) {
			setAdimplente(true);
		}
		
		return isAdimplente();
	}
}
