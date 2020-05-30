package ua.lviv.lgs.rt.spring.repository;

import ua.lviv.lgs.rt.spring.controller.domain.User;

import java.util.List;

public interface UserRepositoryCustom {
    List<User> findUsersByBirthday(String birthday);

}
