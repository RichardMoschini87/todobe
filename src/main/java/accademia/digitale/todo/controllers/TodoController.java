package accademia.digitale.todo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	
	
	@GetMapping("/todos")	
	public String getTest() {
		return "Hello World!";
	}

}
