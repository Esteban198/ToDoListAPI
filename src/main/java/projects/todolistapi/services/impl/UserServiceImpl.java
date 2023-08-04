package projects.todolistapi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import projects.todolistapi.entity.User;
import projects.todolistapi.models.UserDTO;
import projects.todolistapi.repository.UserRepository;
import projects.todolistapi.services.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findUser(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public void signUp(@RequestBody UserDTO user) {
        try {
            var bcrypt = new BCryptPasswordEncoder();
            User userEntity = new User(user);
            userEntity.setPassword(bcrypt.encode(userEntity.getPassword()));
            userRepository.save(userEntity);
        }
        catch (Exception ex){
           String error = ex.getMessage();
        }
    }

    public List<User> findAllUsers() {
    return userRepository.findAll();
    }

}
