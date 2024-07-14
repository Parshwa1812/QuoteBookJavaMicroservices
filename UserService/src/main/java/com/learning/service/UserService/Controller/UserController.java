package com.learning.service.UserService.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.service.UserService.DTOs.UpdateUserDTO;
import com.learning.service.UserService.DTOs.UserDTO;
import com.learning.service.UserService.Entity.User;
import com.learning.service.UserService.Services.UserService;


@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/register-user")
    public ResponseEntity<?> registerUser(@Valid @RequestBody UserDTO user)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUser(user));
    }


    @GetMapping("/get-all-users")
    public ResponseEntity<?> getUsers()
    {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getallusers());
    }

    @GetMapping("/get-user-by-id/{userId}")
    public ResponseEntity<?> getUserById(@PathVariable String userId)
    {
    	 return ResponseEntity.status(HttpStatus.OK).body(userService.getUserById(userId));
    }
    
    @PutMapping("/update-user-profile/{userId}")
    public ResponseEntity<?> updateUser(@Valid @RequestBody UpdateUserDTO user,@PathVariable String userId)
    {
    	 return ResponseEntity.status(HttpStatus.CREATED).body(userService.updateUser(user,userId));
    }
}
