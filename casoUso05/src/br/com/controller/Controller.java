package br.com.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import br.com.DAO.ProtocoloDAO;
import br.com.controleAnimais.Protocolo;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/CadastroProtocolo")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="Protocolo")
    private DataSource ds;   
	private ProtocoloDAO pro;
    @Override
    	public void init() throws ServletException {
    		pro = new ProtocoloDAO(ds);
    		super.init();
    	}
    
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String justificativa = request.getParameter("justificativa");
		String resumoIngles = request.getParameter("resumo-ingles");
		int qtdAnimal = Integer.parseInt(request.getParameter("quantidade-animal"));
		String resumoPt= request.getParameter("resumo-pt");
		String dataInicio = request.getParameter("data-inicio");
		String dataTermino = request.getParameter("data-termino");
		String bioterio = request.getParameter("proveniencia");
		String especie = request.getParameter("especie");
		
		Protocolo p = new Protocolo(dataInicio, dataTermino, resumoIngles, resumoPt, justificativa, especie, qtdAnimal, bioterio);
		
		  
		if(pro.cadastrarProtocolo(p)) {
			request.getRequestDispatcher("cadastroSucesso.html").forward(request, response);
		}else{
			request.getRequestDispatcher("cadastrar.html").forward(request, response);
		}
		
		
	}

}
