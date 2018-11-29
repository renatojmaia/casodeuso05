
package br.com.controleAnimais;
import br.com.controleAnimais.Docente;
import br.com.controleAnimais.Docente;

//Classe Cadastro de Protocolo  
public class Protocolo {
		//Atributos
		private int id_protocolo;
		private String dataInicio;
		private String dataTermino;
		private String resumoIngles;
		private String resumoPortugues;
		private String justificativa;
		private String especie;
		private int qtdAnimal;
		private String bioterio;

	

	//Construtor parametrizado superClasse
	public Protocolo(String dataInicio, String dataTermino, String resumoIngles,
			String resumoPortugues, String justificativa, String especie, int qtdAnimal, String bioterio) {
		super();
		this.id_protocolo = id_protocolo;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.resumoIngles = resumoIngles;
		this.resumoPortugues = resumoPortugues;
		this.justificativa = justificativa;
		this.especie = especie;
		this.qtdAnimal = qtdAnimal;
		this.bioterio = bioterio;
	}
	
	//Métodos docente
	//GET 

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

	//Metodos Resumo Protocolo
	//GET
	public String getResumoIngles() {
		return resumoIngles;
	}public String getResumoPortugues() {
		return resumoPortugues;
	}public void setResumoIngles(String resumoIngles) {
		this.resumoIngles = resumoIngles;
	}public void setResumoPortugues(String resumoPortugues) {
		this.resumoPortugues = resumoPortugues;
	}
	
	//Métodos StatusProtocolo
	//GET
public String getBioterio() {
	return bioterio;
}public int getQtdAnimal() {
	return qtdAnimal;
}public void setBioterio(String bioterio) {
	this.bioterio = bioterio;
}public void setEspecie(String especie) {
	this.especie = especie;
}public void setQtdAnimal(int qtdAnimal) {
	this.qtdAnimal = qtdAnimal;
}public String getEspecie() {
	return especie;
}public int getId_protocolo() {
	return id_protocolo;
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
