package ua.lviv.lgs.rt.spring.service;

import ua.lviv.lgs.rt.spring.controller.domain.User;

import java.util.List;

public interface UserService {
    List<User> findUsers();
}
