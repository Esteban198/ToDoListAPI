package projects.todolistapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name="USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String username;

    @Column
    private String last_name;

    @Column
    private String first_name;

    @Column
    private String email;

    @Column
    private String password;

}
