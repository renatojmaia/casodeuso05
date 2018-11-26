package br.com.controleAnimais;


//Classe Bioterio   
public class Bioterio {
	
	//Declaração dos Atributos
	private int id_bioterio;
	private String nome;
	private String local;
	private String curso;
	
	//Contrutor Parametrizado
	public Bioterio(String nome, String local, String curso) {
		super();
		this.nome = nome;
		this.local = local;
		this.curso = curso;
	}

	//Construtor parametrizado
	public Bioterio(int id_bioterio, String nome, String local, String curso) {
		super();
		this.id_bioterio = id_bioterio;
		this.nome = nome;
		this.local = local;
		this.curso = curso;
	}

	//Metodos bioterio
	//GET
	public int getId_bioterio() {
		return id_bioterio;
	}
	//SET
	public void setId_bioterio(int id_bioterio) {
		this.id_bioterio = id_bioterio;
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

	//Metodos Local
	//GET
	public String getLocal() {
		return local;
	}
	//SET
	public void setLocal(String local) {
		this.local = local;
	}

	//Metodos Curso
	//GET
	public String getCurso() {
		return curso;
	}
	//SET
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
