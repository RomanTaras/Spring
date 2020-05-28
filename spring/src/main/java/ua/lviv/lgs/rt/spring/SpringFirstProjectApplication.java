package ua.lviv.lgs.rt.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ua.lviv.lgs.rt.spring.controller.UserController;
import ua.lviv.lgs.rt.spring.repository.UserRepository;
import ua.lviv.lgs.rt.spring.service.UserService;

@SpringBootApplication
public class SpringFirstProjectApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringFirstProjectApplication.class, args);

		UserController userController = ctx.getBean(UserController.class);
		UserController userController1 = ctx.getBean(UserController.class);
		UserController userController2 = ctx.getBean(UserController.class);
		UserController userController3 = ctx.getBean(UserController.class);

		UserService userService = ctx.getBean(UserService.class);
		UserRepository userRepository = ctx.getBean(UserRepository.class);

	}

}
