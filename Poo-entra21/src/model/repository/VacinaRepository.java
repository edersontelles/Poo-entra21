package model.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.entidade.Vacina;

public class VacinaRepository {

	public Vacina inserir(Vacina novaVacina) {
		Connection conexao = Banco.getConnection();
		String sql = " INSERT INTO `vacinas`.`vacina` (`pais_origem`, `estagio_pesquisa`, `data_inicio_pesquisa`, `nome_responsavel`) VALUES ('"+novaVacina.getPaisOrigem()+"', '"+novaVacina.getEstagioPesquisa()+"', ? ,'"+novaVacina.getNomePesquisadorResponsavel()+"')";
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);
		ResultSet rs;
		int pk = -1;
		try {
			stmt.setDate(1, new Date(novaVacina.getDataInicioPesquisa().getTime()));
			stmt.executeUpdate();

			//Obter a chave gerada
			rs = stmt.executeQuery("SELECT LAST_INSERT_ID() FROM vacina");

			if (rs.next()) {
				pk = rs.getInt(1);
			}
			
			else {
				System.out.println("Erro ao pegar a chave primaria");
			}

			rs.close();
			//System.out.println("Key returned from " + pk);
			
			//Preencher a chave em novaVacina
			novaVacina.setId(pk);

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conexao);
		}

		return novaVacina;
	}

	//Update
	public void atualizar(Vacina vacina) {
		//public Vacina atualizar(Vacina vacina) {

		Connection conexao = Banco.getConnection();
		String sql = " UPDATE vacina SET pais_origem = ?, estagio_pesquisa = ?, data_inicio_pesquisa = ?, nome_responsavel = ? WHERE ID = ? ";
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);

		try {
			stmt.setString(1, vacina.getPaisOrigem());
			stmt.setInt(2, vacina.getEstagioPesquisa());
			stmt.setDate(3, new Date(vacina.getDataInicioPesquisa().getTime()));
			stmt.setString(4, vacina.getNomePesquisadorResponsavel());
			stmt.setInt(5, vacina.getId());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conexao);
		}

	}

	//Delete
	public boolean excluir(int id) {
		boolean excluiu = false;

		//Conectar no banco
		Connection conexao = Banco.getConnection();
		String sql = " DELETE FROM VACINA WHERE ID = ? ";
		//Obter o preparedStatement
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);
		try {
			//Executar
			stmt.setInt(1, id);
			int registrosExcluidos = stmt.executeUpdate();
			excluiu = (registrosExcluidos > 0);
		} catch (SQLException e) {
			System.out.println("Erro ao excluir vacina.\nCausa: " + e.getCause());
		}finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conexao);
		}

		return excluiu;
	}

	//Retrieve
	public Vacina pesquisarPorId(int id) {

		Connection conexao = Banco.getConnection();
		String sql = " SELECT * FROM `vacina` WHERE ID = " + id;
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);
		ResultSet rs;
		Vacina v = new Vacina();
		try {
			rs = stmt.executeQuery(sql);

			if(rs != null && rs.next()) {
				v.setId(rs.getInt("id"));
				v.setPaisOrigem(rs.getString("pais_origem"));
				v.setEstagioPesquisa(rs.getInt("estagio_pesquisa"));
				v.setDataInicioPesquisa(rs.getDate("data_inicio_pesquisa"));
				v.setNomePesquisadorResponsavel(rs.getString("nome_responsavel"));
			}
		}
		catch (SQLException e) {
			System.out.println("Erro de Consulta no BD: " + e.getCause() + e.getLocalizedMessage());
		}finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conexao);
		}

		return v;
	}

	public ArrayList<Vacina> pesquisarTodas(){
		Connection conexao = Banco.getConnection();
		String sql = " SELECT * FROM `vacina` ";
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);
		ResultSet rs;
		ArrayList<Vacina> arrV = new ArrayList<Vacina>();
		try {
			//stmt.setInt(1, id);
			rs = stmt.executeQuery(sql);

			while(rs != null && rs.next()) {
				Vacina v = new Vacina();
				v.setId(rs.getInt("id"));
				v.setPaisOrigem(rs.getString("pais_origem"));
				v.setEstagioPesquisa(rs.getInt("estagio_pesquisa"));
				v.setDataInicioPesquisa(rs.getDate("data_inicio_pesquisa"));
				v.setNomePesquisadorResponsavel(rs.getString("nome_responsavel"));
				arrV.add(v);
			}
		}
		catch (SQLException e) {
			System.out.println("Erro de Consulta no BD: " + e.getCause() + e.getLocalizedMessage());
		}finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conexao);
		}

		return arrV;
	}

}