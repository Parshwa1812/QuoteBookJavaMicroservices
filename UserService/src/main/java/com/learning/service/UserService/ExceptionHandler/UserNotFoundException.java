package com.learning.service.UserService.ExceptionHandler;



public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String userId) {
        super("User not found with id : " + userId);
    }
}