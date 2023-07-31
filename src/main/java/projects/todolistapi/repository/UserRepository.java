package projects.todolistapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projects.todolistapi.entity.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}
