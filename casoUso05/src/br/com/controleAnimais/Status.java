package br.com.controleAnimais;

public class Status {
	
	private int id_status;
	private String status;
	private String justificativa;
	
	private Status(String status, String justificativa) {
		this.status = status;
		this.justificativa = justificativa;
		
	}
	
	public int getId_status() {
		return id_status;
	}
	public void setId_status(int id_status) {
		this.id_status = id_status;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
