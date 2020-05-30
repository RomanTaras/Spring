package ua.lviv.lgs.rt.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.rt.spring.controller.domain.User;
import ua.lviv.lgs.rt.spring.repository.UserRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findUsers() {
        return Collections.emptyList();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByEmail(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

}
