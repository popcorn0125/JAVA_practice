package org.comstudy.myweb.model;

import java.util.ArrayList;

public class TodoListVo {
	private ArrayList<TodoVo> todoList;
	private static TodoListVo todoListVo = new TodoListVo();

	private TodoListVo() {
		if(todoList == null) {
			todoList = new ArrayList<>();
			todoList.add(new TodoVo(1, "새 할일", "복습하기", false));
			todoList.add(new TodoVo(2, "새 할일2", "예습하기", true));
			todoList.add(new TodoVo(3, "새 할일3", "기숙사에 들고 갈 짐 챙기기", false));
		}
	}

	public ArrayList<TodoVo> getTodoList() {
		return todoList;
	}
	
	public void setTodoList(ArrayList<TodoVo> todoList) {
		this.todoList = todoList;
	}

	public static TodoListVo getTodoListVo() {
		return todoListVo;
	}

	
}
