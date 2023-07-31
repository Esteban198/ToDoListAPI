package projects.todolistapi.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "USER", schema = "todo", catalog = "")
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "username", nullable = true, length = 30)
    private String username;
    @Basic
    @Column(name = "last_name", nullable = true, length = 20)
    private String lastName;
    @Basic
    @Column(name = "first_name", nullable = true, length = 20)
    private String firstName;
    @Basic
    @Column(name = "email", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "password", nullable = true, length = 100)
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id && Objects.equals(username, that.username) && Objects.equals(lastName, that.lastName) && Objects.equals(firstName, that.firstName) && Objects.equals(email, that.email) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, lastName, firstName, email, password);
    }
}
