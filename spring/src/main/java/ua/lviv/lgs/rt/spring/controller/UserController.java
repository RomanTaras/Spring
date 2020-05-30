package ua.lviv.lgs.rt.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.lgs.rt.spring.controller.domain.User;
import ua.lviv.lgs.rt.spring.service.UserService;

@RestController
public class UserController {
    public UserController() {
        System.out.println("Create User Controller");
    }

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public User getUsers(@RequestParam String email) {
        return userService.findByEmail(email).get();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        userService.createUser(user);
        return user;
    }
}
