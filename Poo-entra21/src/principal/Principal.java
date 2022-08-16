package principal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import model.entidade.Pessoa;
import model.entidade.PessoaFisica;
import model.entidade.PessoaJuridica;
import model.entidade.Vacina;
import model.repository.VacinaRepository;

public class Principal {

	public static void main(String[] args) {

		// TODO apenas para TESTES! Ainda violando o MVC
		
		// Excluir
		/*
		 * VacinaRepository vacinaRep = new VacinaRepository(); 
		 * if(vacinaRep.excluir(2))
		 * { 
		 * 		System.out.println("Vacina 2 excluída."); 
		 * }
		 */

		// Pesquisar por id
		/*
		 * VacinaRepository vacinaRep = new VacinaRepository();
		 * vacinaRep.pesquisarPorId(2);
		 * System.out.println(vacinaRep.pesquisarPorId(2).toString());
		 */

		// Pesquisar todas
		/*
		 * VacinaRepository vacinaRep = new VacinaRepository();
		 * vacinaRep.pesquisarTodas(); 
		 * System.out.println(vacinaRep.pesquisarTodas());
		 */

		// Atualizar
		Date dataIniPes = new Date(0001, 01, 01); 
		Vacina v = new Vacina();

		v.setId(2); 
		v.setPaisOrigem("Brasil"); 
		v.setEstagioPesquisa(1);
		v.setDataInicioPesquisa(dataIniPes);
		v.setNomePesquisadorResponsavel("Beutrano");

		VacinaRepository vacinaRep = new VacinaRepository(); 
		vacinaRep.atualizar(v);

		// Inserir nova vacina
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		//Vacina v = new Vacina();
		//v.setEstagioPesquisa(1);
		//v.setPaisOrigem("Brasil");
		//v.setDataInicioPesquisa(new Date());
		//v.setNomePesquisadorResponsavel("Fulano");

		//VacinaRepository vacinaRep = new VacinaRepository();
		//v = vacinaRep.inserir(v);
		
		//System.out.println(v);
		

		// Date dataNascimento = new Date(2000, 8, 30);
		// PessoaFisica novaPessoa = new PessoaFisica("123", "Juca", dataNascimento,
		// 1.75, 'M');
		//
		// System.out.println(novaPessoa.calcularIdade());
		//
		// ArrayList<Pessoa> correntistas = new ArrayList<Pessoa>();
		//
		// PessoaFisica pedro = new PessoaFisica("Pedro de Lara", "01233311122");
		// pedro.setDataNascimento("15/08/1802");
		//
		// PessoaJuridica firma1 = new PessoaJuridica("A firma",
		// "22333333000011");
		//
		// correntistas.add(pedro);
		// correntistas.add(firma1);
		//
		// for(int i=0; i < correntistas.size(); i++) {
		// System.out.println("Apelido: "
		// + correntistas.get(i).getApelido());
		// }
	}
}
