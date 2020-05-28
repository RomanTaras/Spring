package ua.lviv.lgs.rt.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.lgs.rt.spring.controller.domain.User;
import ua.lviv.lgs.rt.spring.service.UserService;

import java.util.List;

@RestController
public class UserController {
    public UserController() {
        System.out.println("Create User Controller");
    }

    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.findUsers();
    }
}
