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
 * Servlet implementation class TodoInput
 */
@WebServlet("/todo/input")
public class TodoInput extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = "/WEB-INF/views/TodoInput.jsp";
		RequestDispatcher view = request.getRequestDispatcher(path);
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8"); // 요청 데이터의 인코딩을 UTF-8로 설정
		ArrayList<TodoVo> todo = TodoListVo.getTodoListVo().getTodoList();
		int idx = todo.get(todo.size()-1).getNo() + 1;
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		todo.add(new TodoVo(idx, title, description, false));
		TodoListVo.getTodoListVo().setTodoList(todo);
		response.sendRedirect("list");
	}

}
