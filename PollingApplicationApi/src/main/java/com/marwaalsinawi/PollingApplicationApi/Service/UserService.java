package com.marwaalsinawi.PollingApplicationApi.Service;

import com.marwaalsinawi.PollingApplicationApi.Models.Users;
import com.marwaalsinawi.PollingApplicationApi.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
UserRepository userRepository;
    public void createUser( String username,String password) {
        Users users = new Users();
        users.setPassword(password);
        users.setUsername(username);
        userRepository.save(users);


    }
}
