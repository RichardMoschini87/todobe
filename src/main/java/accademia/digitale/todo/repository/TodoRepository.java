package accademia.digitale.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import accademia.digitale.todo.models.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
	
}
