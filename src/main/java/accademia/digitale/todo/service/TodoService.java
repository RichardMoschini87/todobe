package accademia.digitale.todo.service;

import java.util.List;
import java.util.Optional;

import accademia.digitale.todo.models.Todo;

public interface TodoService {

	public List<Todo> getTodos();

	public Optional<Todo> getTodoById(Integer id);

	public void deleteTodo(Integer id);

	public void insertTodo(Todo todo);

	public void updateTodo(Todo todo);

}
