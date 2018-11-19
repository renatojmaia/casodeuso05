
package br.com.controleAnimais;
import br.com.controleAnimais.Docente;

public class Protocolo {
	private int id_protocolo;
	private  Docente docente;
	private int id_parecer;
	private int statusProtocolo;
	private String dataInicio;
	private String dataTermino;
	private String resumoSimples;
	private String resumoProtocolo;
	private String justificativa;
	private int parecerFinal;
	
	
	

	
	public Protocolo(int id_protocolo, Docente docente, int statusProtocolo, String dataInicio, String dataTermino,
			String resumoSimples, String resumoProtocolo, String justificativa, int parecerFinal) {
		super();
		this.id_protocolo = id_protocolo;
		this.docente = docente;
		this.statusProtocolo = statusProtocolo;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.resumoSimples = resumoSimples;
		this.resumoProtocolo = resumoProtocolo;
		this.justificativa = justificativa;
		this.parecerFinal = parecerFinal;
	}

	public Protocolo(Docente docente, int statusProtocolo, String dataInicio, String dataTermino, String resumoSimples,
			String resumoProtocolo, String justificativa, int parecerFinal) {
		super();
		this.docente = docente;
		this.statusProtocolo = statusProtocolo;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.resumoSimples = resumoSimples;
		this.resumoProtocolo = resumoProtocolo;
		this.justificativa = justificativa;
		this.parecerFinal = parecerFinal;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	
	public int getParecerFinal() {
		return parecerFinal;
	}
	
	public void setParecerFinal(int parecerFinal) {
		this.parecerFinal = parecerFinal;
	}
	
	public void setResumoProtocolo(String resumoProtocolo) {
		this.resumoProtocolo = resumoProtocolo;
	}
	
	public void setResumoSimples(String resumoSimples) {
		this.resumoSimples = resumoSimples;
	}
	
	public void setStatusProtocolo(int statusProtocolo) {
		this.statusProtocolo = statusProtocolo;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getDataInicio() {
		return dataInicio;
	}
	public String getDataTermino() {
		return dataTermino;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public int getStatusProtocolo() {
		return statusProtocolo;
	}
	public String getResumoProtocolo() {
		return resumoProtocolo;
	}
	public String getResumoSimples() {
		return resumoSimples;
	}
}
