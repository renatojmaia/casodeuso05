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
			String query = "INSERT INTO protocolo () VALUES ()";
			
			p1 = c.prepareStatement(query);
			p1.setString(1, p.getDataInicio());
			
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
