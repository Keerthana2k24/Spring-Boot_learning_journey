package Project.TODO.repository;

import Project.TODO.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Todorepository extends JpaRepository<Todo,Integer> {

}
