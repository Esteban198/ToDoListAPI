package projects.todolistapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ToDo {
    @Id
    private long id;
    private String nombre;

}
