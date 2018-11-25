package br.com.controleAnimais;

//Classe Docente
public class Docente {
	
	//Declaração dos atributos
	private int id_docente;
	private String nome;
	private String dataNasc; 
	private String email;
	private String funcao;
		
	//Construtor parametrizado
	public Docente(String nome, String dataNasc, String email, String funcao) {
		this.setNome(nome);
		this.setDataNasc(dataNasc);
		this.setEmail(email);
		this.setFuncao(funcao);
	}
	 
	//Metodos id_docente
	//GET
	public int getId_docente() {
		return id_docente;
	}
	//SET
	public void setId_docente(int id_docente) {
		this.id_docente = id_docente;
	}
	
	//Metodos Nome
	//GET
	public String getNome() {
		return nome;
	}
	//SET
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Metodos Data Nascimento
	//GET
	public String getDataNasc() {
		return dataNasc;
	}
	//SET
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	//Metodos email
	//GET
	public String getEmail() {
		return email;
	}
	//SET 
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Metodos funcao
	//GET
	public String getFuncao() {
		return funcao;
	}
	//SET
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
}
