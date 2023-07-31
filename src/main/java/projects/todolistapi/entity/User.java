package projects.todolistapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name="USER")
public class USER {

    @Id
    @GeneratedValue
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
