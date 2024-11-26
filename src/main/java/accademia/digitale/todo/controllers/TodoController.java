package accademia.digitale.todo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import accademia.digitale.todo.models.Priorita;
import accademia.digitale.todo.models.Todo;
import accademia.digitale.todo.service.PriorityService;
import accademia.digitale.todo.service.TodoService;

@CrossOrigin
@RestController
public class TodoController {

	@Autowired
	private TodoService todoService;

	@Autowired
	private PriorityService priorityService;

	@GetMapping("/todos")
	public List<Todo> getTodos() {
		return todoService.getTodos();
	}

	@GetMapping("/priorities")
	public List<Priorita> getPrioriies() {
		return priorityService.getPriorities();
	}

	@GetMapping("/todo")
	public Optional<Todo> getTodo(@RequestParam(name = "id") Integer id) {
		return todoService.getTodoById(id);
	}

	@PostMapping("/todo")
	public void insertTodo(@RequestBody Todo todo) {
		todoService.insertTodo(todo);
	}

	@PutMapping("/todo")
	public void getTopdateTodo(@RequestBody Todo todo) {
		todoService.updateTodo(todo);
	}

	@DeleteMapping("/todo/{id}")
	public void deleteTodo(@PathVariable Integer id) {
		todoService.deleteTodo(id);
	}
}
