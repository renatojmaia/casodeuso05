package br.com.controleAnimais;

public class detalheProtcolo {

	private int id_protocolo;
	private int quantidade;

	public detalheProtcolo (int id_protocolo, int quantidade) {
		this.setQuantidade(quantidade);
		this.setId_protocolo(id_protocolo);
	}
	
	public int getId_protocolo() {
		return id_protocolo;
	}
	
	public void setId_protocolo(int id_protocolo) {
		this.id_protocolo = id_protocolo;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
