package Project.TODO.service;

import Project.TODO.model.Todo;
import Project.TODO.repository.Todorepository;
import Project.TODO.repository.Todorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
@Autowired
Todorepository repo;
    public void add(Todo app) {
        repo.save(app);
    }

    public List<Todo> show() {
      return repo.findAll();
    }

    public Todo edit(int id, Todo todo) {
        Todo existing = repo.findById(id).orElse(null);
        System.out.println(existing);
        if(existing != null) {
            existing.setTask(todo.getTask());
            existing.setStatus(todo.getStatus());
            return repo.save(existing);
        }
return null;

    }
    public void del(){
        repo.deleteAll();
    }
}
