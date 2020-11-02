package br.com.alura.gerenciador.acao;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;


public class RemoveEmpresa {
	

	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Removendo empresa...");
		
		Integer id = Integer.valueOf( request.getParameter("id") );
		
		Banco banco = new Banco();
		banco.remove(id);
		
		response.sendRedirect("entrada?acao=ListaEmpresas");
		
	}

}
