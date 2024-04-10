package com.example.SpringAPI.service;

import com.example.SpringAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1,"Ilias", 32, "ilias@mail.com");
        User user2 = new User(2,"George", 26, "george@mail.com");
        User user3 = new User(3,"John", 45, "john@mail.com");

        userList.addAll(Arrays.asList(user1,user2,user3));
    }

    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for (User user: userList) {
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
