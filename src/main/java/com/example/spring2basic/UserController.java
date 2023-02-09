package com.example.spring2basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/addUser")
    public String addUser(@RequestBody() User user){
        return userService.add(user);
    }
    @GetMapping("/getbook")
    public User getUser(@RequestParam("id") int id){
        return userService.get(id);
    }
    @GetMapping("/getall")
    public List<User> findall(){
        return userService.findall();
    }
}
