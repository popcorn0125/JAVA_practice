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
 * Servlet implementation class TodoDelete
 */
@WebServlet("/todo/delete")
public class TodoDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8"); // 요청 데이터의 인코딩을 UTF-8로 설정
		ArrayList<TodoVo> todoList = TodoListVo.getTodoListVo().getTodoList();
		int no = Integer.parseInt(request.getParameter("no"));
		int idx = -1;
		for(int i = 0; i < todoList.size(); i++) {
			if(todoList.get(i).getNo() == no) {
				idx = i;
				break;
			}
		}
		if(idx != -1) {
			todoList.remove(idx);

		}
		TodoListVo.getTodoListVo().setTodoList(todoList);
		response.sendRedirect("list");
//		String path = "/WEB-INF/views/TodoDetail.jsp";
//		RequestDispatcher view = request.getRequestDispatcher(path);
//		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
