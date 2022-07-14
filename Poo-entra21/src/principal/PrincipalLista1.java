package principal;

import java.security.PublicKey;
import java.util.ArrayList;

import entidade.Conta;
import entidade.Pessoa;
import entidade.PessoaFisica;
import entidade.PessoaJuridica;

public class PrincipalLista1 {

	public static void main(String[] args) {
		/*
		//Crie uma conta chamada “conta1”
		//	com agência 123-7, 
		//	conta 12345-6 e saldo inicial de 300;
		double valorParaSacar = 250;

		Conta conta1 = new Conta("123-7", "12345-6", 300);

		System.out.println("Saldo da conta: R$" + conta1.getSaldo());

		double valorSacadoDeFato = conta1.sacar(valorParaSacar);

		System.out.println("Solicitado o saque de R$" + valorParaSacar);
		//Efetue um saque de 250 e mostre o valor sacado na tela;
		System.out.println("Sacado R$" + valorSacadoDeFato);
		System.out.println("Saldo da conta: R$" + conta1.getSaldo());

		//Efetue outro saque de 300 e mostre o valor sacado na tela;
		System.out.println("Solicitado o saque de R$300");
		System.out.println("Sacado R$" + conta1.sacar(300));
		System.out.println("Saldo da conta: R$" + conta1.getSaldo());

		//Faça um depósito de 200;
		System.out.println("Solicitado o depósito de R$200");
		conta1.depositar(200);
		System.out.println("Saldo da conta: R$" + conta1.getSaldo());

		//Faça um rendimento de 0.5%;
		System.out.println("Solicitado o rendimento de 0.5%");
		conta1.efetuarRendimento(0.5);
		System.out.println("Saldo da conta: R$" + conta1.getSaldo());

		//Faça um rendimento de 0.8%;
		System.out.println("Solicitado o rendimento de 0.8%");
		conta1.efetuarRendimento(0.8);
		System.out.println("Saldo da conta: R$" + conta1.getSaldo());

		//Mostre o valor do saldo atual na tela.
		*/
		
		// cadastrar as contas
		Conta conta1 = new Conta("123-6", "12345-6", 600);
		Conta conta2 = new Conta("123-7", "12345-7", -700);
		
		// preencher numa lista de contas
		ArrayList<Conta> contas = new ArrayList<Conta>();
		contas.add(conta1);
		contas.add(conta2);
		
		// cadastrar uma lista de pessoas (PFs)
		ArrayList<Pessoa> pessoasF = new ArrayList<Pessoa>();
		
		PessoaFisica pedro = new PessoaFisica("Pedro", "01233311122");
		pedro.setDataNascimento("15/08/1802");
		// associar a lista de contas à pessoa
		pedro.setContas(contas);
		
		pessoasF.add(pedro);
		
		// Verificar Adimplência
		pedro.verificarAdimplente();
		
		for(int i = 0; i < pessoasF.size(); i++) {
			System.out.println("Nome: " + pessoasF.get(i).getNome() + " | Adimplência: " + pessoasF.get(i).isAdimplente());
		}
		
		
		
		ArrayList<Pessoa> pessoasJ = new ArrayList<Pessoa>();
		
		PessoaJuridica firma1 = new PessoaJuridica("A firma", "22333333000011");
		
		pessoasJ.add(firma1);
		
		
	}
}