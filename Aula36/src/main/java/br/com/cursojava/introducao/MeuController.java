package br.com.cursojava.introducao;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/hello")

public class MeuController extends HttpServlet{
	
	private SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy hh:mm");
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/ola.jsp");
	req.setAttribute("dataHora", sdf.format(new Date()));
	dispatcher.forward(req, resp);
	}

}
