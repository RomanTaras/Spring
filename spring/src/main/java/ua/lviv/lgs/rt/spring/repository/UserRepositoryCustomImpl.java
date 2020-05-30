package ua.lviv.lgs.rt.spring.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.lviv.lgs.rt.spring.controller.domain.User;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom {
    @Autowired
    EntityManager em;

    @Override
    public List<User> findUsersByBirthday(String birthday) {

        return null;
    }
}
