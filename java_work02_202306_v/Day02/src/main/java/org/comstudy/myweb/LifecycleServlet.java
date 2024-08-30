package org.comstudy.myweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 어노테이션을 이용해서 URL 매핑 하는 대신 web.xml에 URL매핑한다.
public class LifecycleServlet extends HttpServlet {
	
	 public LifecycleServlet() {
	      System.out.println("생성자() - LifecycleServlet");
	   }

	   @Override
	   protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      System.out.println("service() - LifecycleServlet");
	   }

	   @Override
	   public void destroy() {
	      System.out.println("destroy() - LifecycleServlet");
	   }

	   @Override
	   public void init() throws ServletException {
	      System.out.println("init() - LifecycleServlet");
	   }

	
}
