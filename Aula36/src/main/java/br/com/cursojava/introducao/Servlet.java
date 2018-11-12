package br.com.cursojava.introducao;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet  {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		StringBuilder html = new StringBuilder();
		html
		.append("<!doctype html>")
		.append("<html>")
		.append("<head>")
		.append("<meta charset=\"utf-8\">")
		.append("<title>Servlet</title>")
		.append("</head>")
		.append("<body>")
		.append("<h1> Meu segundo Servlet!!!!</h1>")
		.append("</body>")
		.append("</html>");
		
		writer.println(html);
		
	}
	
}
