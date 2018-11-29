package br.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import br.com.controleAnimais.Protocolo;

//Classe de Persistencia Protocolo  
public class ProtocoloDAO {
	//Atributos
	private DataSource ds;
	
	//Construtor
	public ProtocoloDAO(DataSource ds){
		this.ds = ds;
	}
	
	//Metodo cadastar protocolo
	public boolean cadastrarProtocolo(Protocolo p) {
		Connection c;
		PreparedStatement p1;
		ResultSet r;
		
		try {
			c = ds.getConnection();
			String query = "INSERT INTO protocolo (justificativa, resumoPortugues, resumoIngles, dataInicio, dataTermino, especie, qtdAnimal, bioterio) VALUES (?, ?,  ?, ?, ?, ?, ?, ?)";
			
			p1 = c.prepareStatement(query);
			p1.setString(1, p.getJustificativa());
			p1.setString(2, p.getResumoPortugues());
			p1.setString(3, p.getResumoIngles());
			p1.setString(4, p.getDataInicio());
			p1.setString(5, p.getDataTermino());
			p1.setString(6, p.getEspecie());
			p1.setInt(7, p.getQtdAnimal());
			p1.setString(8, p.getBioterio());
			
			if(p1.execute()) {
				return true;
			}else{
				return false;
			}
		} catch (SQLException e) {
			return false;
		}
		
		
		
		
	}
}
