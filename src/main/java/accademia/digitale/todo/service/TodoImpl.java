package accademia.digitale.todo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import accademia.digitale.todo.models.Todo;
import accademia.digitale.todo.repository.TodoRepository;

@Service
public class TodoImpl implements TodoService {
	
    private static final Logger log = LoggerFactory.getLogger(TodoImpl.class);

	@Autowired
	private TodoRepository repository;	
	
	@Override
	public List<Todo> getTodos() {
		log.info("Inizio chiamata todos");
		return repository.findAll();
	}

	@Override
	public Optional<Todo> getTodoById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void insertTodo(Todo todo) {
		repository.save(todo);
	}

	@Override
	public void updateTodo(Todo todo) {
		repository.save(todo);
	}
	

}
