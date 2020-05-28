package ua.lviv.lgs.rt.spring.service;

import org.springframework.stereotype.Service;
import ua.lviv.lgs.rt.spring.controller.domain.User;

import java.util.Collections;
import java.util.List;

//@Service
public class UserServiceTestImpl implements UserService {


    @Override
    public List<User> findUsers() {
        return Collections.emptyList();
    }
}
