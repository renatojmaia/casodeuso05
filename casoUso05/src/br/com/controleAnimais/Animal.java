package br.com.controleAnimais;

//Classe Animal
public class Animal {
	
	//Declaração dos atributos   
	private int id_animal;
	private String especie;
	private String bioterio;
	private String nome;
	private String grupo;
	
	//Construtor parametrizado
	public Animal(int id_animal, String especie, String bioterio, String nome, String grupo) {
		super();
		this.especie = especie;
		this.bioterio = bioterio;
		this.nome = nome;
		this.grupo = grupo;
		this.id_animal = id_animal;
	}
	
	//construtor parametrizado
	public Animal(String especie, String bioterio, String nome, String grupo) {
		super();
		this.especie = especie;
		this.bioterio = bioterio;
		this.nome = nome;
		this.grupo = grupo;
	}

	//Metodos Especie
	//GET
	public String getEspecie() {
		return especie;
	}

	//SET
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	//Metodos Bioterio
	//GET
	public String getBioterio() {
		return bioterio;
	}

	//SET
	public void setBioterio(String bioterio) {
		this.bioterio = bioterio;
	}

	//Metodo Nome
	//GET
	public String getNome() {
		return nome;
	}

	//SET
	public void setNome(String nome) {
		this.nome = nome;
	}

	//Metodos Grupo
	//GET
	public String getGrupo() {
		return grupo;
	}

	//SET
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	
}
