package accademia.digitale.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import accademia.digitale.todo.models.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
	
	@Query("SELECT max(t.id) from Todo t")
	Integer findLastTod();
	
	@Query(nativeQuery = true,value = "SELECT max(t.id) from todolist t")
	Integer findLastTodo();	
}
