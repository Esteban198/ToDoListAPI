package projects.todolistapi.entity;

import jakarta.persistence.*;
import lombok.Data;
import projects.todolistapi.models.UserDTO;

import java.io.Serializable;


@Data
@Entity
@Table(name="USER")
public class User implements Serializable {

    public User(UserDTO user) {
        this.username = user.getUsername();
        this.first_name = user.getFirst_name();
        this.last_name = user.getLast_name();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;

    private String last_name;

    private String first_name;

    private String email;

    private String password;

    public User() {

    }
}
