package ua.lviv.lgs.rt.spring.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.lgs.rt.spring.controller.domain.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {

      Optional<User> findByEmail(String email);

      Optional<User> findByFirstName(String firstName);

      List<User> findByFirstNameAndLastName(String firstName, String lastName);

      Page<User> findByFirstNameAndLastName(String firstName, String lastName, Pageable pageable);


}
