package org.comstudy.myweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class App
 */
@WebServlet("/app")
public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; cahrset=UTF-8");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// PrintWriter 객체를 이용해서 화면에 HTML 출력
		// node.js에서 res.end와 비슷하다 보면 된다.
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>App 서블렛 예제</title>\r\n"
				+ "</head>\r\n"
				+ "<body>");
		out.println("<h1>Hello Servlet</h1>");
		out.println("<a href=index.jsp>index 페이지로 이동</a>");
		out.println("</body></html>");
		out.close();
	} // end of doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
