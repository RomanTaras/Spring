package ua.lviv.lgs.rt.spring.controller.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class User {

    private Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
