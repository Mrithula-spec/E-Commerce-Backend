package com.mri.Mri.Ecommerce.controller;
import com.mri.Mri.Ecommerce.model.User;
import com.mri.Mri.Ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User login(@RequestParam String username, @RequestParam String password) {
        return userService.authenticate(username, password);
    }
}

