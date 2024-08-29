package org.comstudy.myweb;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy.myweb.model.TodoListVo;
import org.comstudy.myweb.model.TodoVo;

/**
 * Servlet implementation class TodoModify
 */
@WebServlet("/todo/modify")
public class TodoModify extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title = "";
		boolean done = false;
		ArrayList<TodoVo> todoList = TodoListVo.getTodoListVo().getTodoList();
		int no = Integer.parseInt(request.getParameter("no"));
		for(int i = 0; i < todoList.size(); i++) {
			if(todoList.get(i).getNo() == no) {
				title = todoList.get(i).getTitle();
				done = todoList.get(i).isDone();
				break;
			}
		}
		
		request.setAttribute("no", no);
		request.setAttribute("title", title);
		request.setAttribute("done", done);

		String path = "/WEB-INF/views/TodoModify.jsp";
		RequestDispatcher view = request.getRequestDispatcher(path);
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8"); // 요청 데이터의 인코딩을 UTF-8로 설정
		String title = request.getParameter("title");
		int no = Integer.parseInt(request.getParameter("no"));
		boolean done = Boolean.parseBoolean(request.getParameter("done"));

		ArrayList<TodoVo> todoList = TodoListVo.getTodoListVo().getTodoList();
		for(int i = 0; i < todoList.size(); i++) {
			if(todoList.get(i).getNo() == no) {
				todoList.get(i).setTitle(title);
				todoList.get(i).setDone(done);
				break;
			}
		}
		response.sendRedirect("list");
	}

}
