package br.com.controleAnimais;
import br.com.controleAnimais.Docente;

public class Parecer {
	private int id_parecer;
	private Docente docente;
	private String parecer;
	private int status;
	
	public Parecer(int id_parecer, Docente docente, String parecer, int status) {
		super();
		this.id_parecer = id_parecer;
		this.docente = docente;
		this.parecer = parecer;
		this.status = status;
	}

	public Parecer(Docente docente, String parecer, int status) {
		super();
		this.docente = docente;
		this.parecer = parecer;
		this.status = status;
	}

	public int getId_parecer() {
		return id_parecer;
	}
	public int getStatus() {
		return status;
	}

	public void setId_parecer(int id_parecer) {
		this.id_parecer = id_parecer;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public String getParecer() {
		return parecer;
	}

	public void setParecer(String parecer) {
		this.parecer = parecer;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	

}
