package br.com.controleAnimais;

public class Docente {
	private int id_docente;
	private String nome;
	private String dataNasc; 
	private String email;
		
	  public Docente() {
		// TODO Auto-generated constructor stub
	}
	  
	public Docente(String nome, String dataNasc, String email) {
		this.setNome(nome);
		this.setDataNasc(dataNasc);
		this.setEmail(email);
	}
	  
	 public int getId_docente() {
		return id_docente;
	}
	
	 public String getNome() {
		return nome;
	}
	 
		
	 public String getDataNasc() {
		return dataNasc;
	}
	 
	public String getEmail() {
		return email;
	}
	
	public void setId_docente(int id_docente) {
		this.id_docente = id_docente;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	 
	 
	public void setEmail(String email) {
		this.email = email;
	}
	 
	
	
	

}
