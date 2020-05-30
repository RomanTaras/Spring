package ua.lviv.lgs.rt.spring.service;

import ua.lviv.lgs.rt.spring.controller.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findUsers();

    User createUser(User user);

    Optional<User> findByEmail(String email);
}
