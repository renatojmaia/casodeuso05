package br.com.controleAnimais;


//Classes Detalhe Protocolo
public class detalheProtcolo {
	
	//Declaração dos Atributos
	private int id_protocolo;
	private int quantidade;

	//Construtor parametrizado
	public detalheProtcolo (int id_protocolo, int quantidade) {
		this.setQuantidade(quantidade);
		this.setId_protocolo(id_protocolo);
	}
	
	//Metodos Id_protocolo
	//GET
	public int getId_protocolo() {
		return id_protocolo;
	}
	//SET
	public void setId_protocolo(int id_protocolo) {
		this.id_protocolo = id_protocolo;
	}
	
	//Metodos quantidade
	//GET
	public int getQuantidade() {
		return quantidade;
	}
	//SET
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
