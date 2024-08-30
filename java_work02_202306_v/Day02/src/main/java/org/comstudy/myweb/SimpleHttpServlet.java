package org.comstudy.myweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleHttpServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Delete Request</title></head>");
        out.println("<body>");
        out.println("<h1>Hello from Delete Request</h1>");
        out.println("</body>");
        out.println("</html>");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>GET Request</title></head>");
        out.println("<body>");
        out.println("<h1>Hello from GET Request</h1>");
        out.println("</body>");
        out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>POST Request</title></head>");
        out.println("<body>");
        out.println("<h1>Hello from POST Request</h1>");
        out.println("</body>");
        out.println("</html>");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>PUT Request</title></head>");
        out.println("<body>");
        out.println("<h1>Hello from PUT Request</h1>");
        out.println("</body>");
        out.println("</html>");
	}
	
}
