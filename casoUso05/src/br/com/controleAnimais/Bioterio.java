package br.com.controleAnimais;

public class Bioterio {
	private int id_bioterio;
	private String nome;
	private String local;
	private String curso;
	
	public Bioterio(String nome, String local, String curso) {
		super();
		this.nome = nome;
		this.local = local;
		this.curso = curso;
	}

	
	public Bioterio(int id_bioterio, String nome, String local, String curso) {
		super();
		this.id_bioterio = id_bioterio;
		this.nome = nome;
		this.local = local;
		this.curso = curso;
	}

	public int getId_bioterio() {
		return id_bioterio;
	}

	public void setId_bioterio(int id_bioterio) {
		this.id_bioterio = id_bioterio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
	
	

}
