package accademia.digitale.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import accademia.digitale.todo.models.Priorita;
import accademia.digitale.todo.repository.PrioritaRepository;

@Service
public class PriorityImpl implements PriorityService {

	@Autowired
	private PrioritaRepository repository;	
	


	@Override
	public List<Priorita> getPriorities() {
		return repository.findAll();
	}

	

}
