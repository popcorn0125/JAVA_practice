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
 * Servlet implementation class TodoList
 */
@WebServlet("/todo/list")
public class TodoList extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	// 멤버 변수 선언
//	private ArrayList<TodoVo> todoList;
//
//	// 생성자 또는 초기화 블록에서 리스트 초기화
//	public TodoList() {
//		todoList = new ArrayList<>();
//		todoList.add(new TodoVo(101, "새 할일", false));
//		todoList.add(new TodoVo(102, "새 할일2", true));
//		todoList.add(new TodoVo(103, "새 할일3", false));
//	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TodoList.jsp 페이지로 forward 하기
		// WEB-INF 내부는 외부에서 브라우저로 접근 할 수 없다. (내부 클래스에서 접근 하거나 forward 가능.)
		
		// TodoList.jsp 뷰페이지에서 사용할 리스트를 바인딩
		ArrayList<TodoVo> todoList = TodoListVo.getTodoListVo().getTodoList();
		request.setAttribute("todoList", todoList);
		
		String path = "/WEB-INF/views/TodoList.jsp";
		RequestDispatcher view = request.getRequestDispatcher(path);
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
