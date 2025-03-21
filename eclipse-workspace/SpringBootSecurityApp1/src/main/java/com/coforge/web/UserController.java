package com.coforge.web;
import com.coforge.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "<h1>Hello World</h1>";
    }

    @GetMapping("/user")
    public User getUser(){
        User user=new User();
        user.setId(1001);
        user.setName("Amit Kumar");
        user.setLocation("Delhi");
        return user;
    }
}
