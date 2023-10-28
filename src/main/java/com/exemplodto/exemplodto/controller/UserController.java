package com.exemplodto.exemplodto.controller;

import com.exemplodto.exemplodto.dto.UserDTO;
import com.exemplodto.exemplodto.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/{id}")
    public UserDTO buscar(@PathVariable Long id){
        return userService.buscarId(id);
    }
}
