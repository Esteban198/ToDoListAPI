package projects.todolistapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import projects.todolistapi.entity.User;
import projects.todolistapi.models.UserDTO;
import projects.todolistapi.repository.UserRepository;
import projects.todolistapi.services.UserService;

import java.util.List;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loginGet(){


        return "ToDoAPP";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password){
        try {
            User user = userService.findUser(username);
            List<User> users = userService.findAllUsers();
            return user.toString();
        }
        catch(Exception ex)
        {
            return ex.getMessage();
}
    }

@RequestMapping(value = "/signup", method = RequestMethod.POST, consumes= MediaType.ALL_VALUE)
public String signUp(@RequestBody UserDTO user){
        try {
            userService.signUp(user);
            return "";
        }
        catch(Exception ex)
        {
            return ex.getMessage();
        }
    }


}
