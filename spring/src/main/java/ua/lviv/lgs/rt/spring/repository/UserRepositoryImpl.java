package ua.lviv.lgs.rt.spring.repository;

import org.springframework.stereotype.Repository;
import ua.lviv.lgs.rt.spring.controller.domain.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public List<User> findUsers() {
        return LongStream.range(0,5).mapToObj(i->new User(i,"user" + i))
                .collect(Collectors.toList());
    }
}
