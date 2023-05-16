package com.marwaalsinawi.PollingApplicationApi.Controller;

import com.marwaalsinawi.PollingApplicationApi.Models.Users;
import com.marwaalsinawi.PollingApplicationApi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "Users")
public class UsersController {
@Autowired
    UserService userService;
    @RequestMapping(value = "/createUser" , method = RequestMethod.POST)
    public String createUser (@RequestParam String username,@RequestParam String password) {
        userService.createUser(username, password);
        return "users Created Successfuly";
}
}
