package br.com.controleAnimais;

public class Animal {
	private int id_animal;
	private String especie;
	private String bioterio;
	private String nome;
	private String grupo;
	
	


	public Animal(int id_animal, String especie, String bioterio, String nome, String grupo) {
		super();
		this.especie = especie;
		this.bioterio = bioterio;
		this.nome = nome;
		this.grupo = grupo;
		this.id_animal = id_animal;
	}
	

	public Animal(String especie, String bioterio, String nome, String grupo) {
		super();
		this.especie = especie;
		this.bioterio = bioterio;
		this.nome = nome;
		this.grupo = grupo;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public String getBioterio() {
		return bioterio;
	}


	public void setBioterio(String bioterio) {
		this.bioterio = bioterio;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getGrupo() {
		return grupo;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	


}
