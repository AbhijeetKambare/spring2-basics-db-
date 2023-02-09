package com.example.spring2basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserReposetory userReposetory;
    public String add(User user){
        userReposetory.save(user);
        return "User added";
    }
    public User get(int id){
        User user= userReposetory.findById(id).get();
        return user;
    }
    public List<User> findall(){
        //List<Integer> list=new ArrayList<>();
        return userReposetory.findAll();
    }
}
