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
	
	
	public Protocolo() {
		
	}
	

	public Protocolo(String dataInicio, String dataTermino, String resumoSimples,
			String resumoProtocolo, String justificativa, int parecerFinal   ) {
		this.setDataInicio(dataInicio);
		this.setDataTermino(dataTermino);
		this.setResumoSimples(resumoSimples);
		this.setResumoProtocolo(resumoProtocolo);
		this.setJustificativa(justificativa);
		this.setParecerFinal(parecerFinal);
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
