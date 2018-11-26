
package br.com.controleAnimais;
import br.com.controleAnimais.Docente;
import br.com.controleAnimais.Docente;

//Classe Cadastro de Protocolo  
public class Protocolo {
		//Atributos
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
	
	//Construtor parametrizado superClasse
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
	//construtor Parametrizado
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
	//Métodos docente
	//GET 
	public Docente getDocente() {
		return docente;
	}
	//SET
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	//Métodos Justificativa 
	//GET
	public String getJustificativa() {
		return justificativa;
	}
	//SET
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	//Métodos Parecer Final
	//GET
	public int getParecerFinal() {
		return parecerFinal;
	}
	//SET
	public void setParecerFinal(int parecerFinal) {
		this.parecerFinal = parecerFinal;
	}
	//Metodos Resumo Protocolo
	//GET
	public String getResumoProtocolo() {
		return resumoProtocolo;
	}
	//SET
	public void setResumoProtocolo(String resumoProtocolo) {
		this.resumoProtocolo = resumoProtocolo;
	}
	
	//Metodos Resumo Simples
	//GET
		public String getResumoSimples() {
			return resumoSimples;
		}	
	//SET
	public void setResumoSimples(String resumoSimples) {
		this.resumoSimples = resumoSimples;
	}
	
	//Métodos StatusProtocolo
	//GET
	public int getStatusProtocolo() {
		return statusProtocolo;
	}
	//SET
	public void setStatusProtocolo(int statusProtocolo) {
		this.statusProtocolo = statusProtocolo;
	}
	
	//Métodos DataInicio
	//GET
	public String getDataInicio() {
		return dataInicio;
	}
	//SET
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	//Métodos DataTérmino
	//GET
	public String getDataTermino() {
		return dataTermino;
	}
	//SET
	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}
		
	
}
