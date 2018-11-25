package br.com.controleAnimais;
import br.com.controleAnimais.Docente;

	//Classe Parecer
	public class Parecer {
		
		//Atributos
		private int id_parecer;
		private Docente docente;
		private String parecer;
		private int status;
		
		//Construtor parametrizado SuperClasse
		public Parecer(int id_parecer, Docente docente, String parecer, int status) {
			super();
			this.id_parecer = id_parecer;
			this.docente = docente;
			this.parecer = parecer;
			this.status = status;
		}
		//Construtor parametrizado
		public Parecer(Docente docente, String parecer, int status) {
			super();
			this.docente = docente;
			this.parecer = parecer;
			this.status = status;
		}
		//Metodos Id_Parecer
		//GET
		public int getId_parecer() {
			return id_parecer;
		}
		//SET
		public void setId_parecer(int id_parecer) {
			this.id_parecer = id_parecer;
		}
		
		//Metodos Status
		//GET
		public int getStatus() {
			return status;
		}
		//SET
		public void setStatus(int status) {
			this.status = status;
		}
		
		//Metodos Docente
		//GET
		public Docente getDocente() {
			return docente;
		}
		//SET
		public void setDocente(Docente docente) {
			this.docente = docente;
		}
		
		//Metodos Parecer
		//GET
		public String getParecer() {
			return parecer;
		}
		//SET
		public void setParecer(String parecer) {
			this.parecer = parecer;
		}
		
		
		
		
		
		
	
}
