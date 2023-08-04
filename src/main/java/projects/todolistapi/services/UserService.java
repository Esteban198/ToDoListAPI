package projects.todolistapi.services;

import projects.todolistapi.entity.User;
import projects.todolistapi.models.UserDTO;
import projects.todolistapi.repository.UserRepository;

import java.util.List;

public interface UserService {

    User findUser(String username);

    void signUp(UserDTO user);

    List<User> findAllUsers();

}
