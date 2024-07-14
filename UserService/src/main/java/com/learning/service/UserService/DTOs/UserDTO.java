package com.learning.service.UserService.DTOs;

import com.learning.service.UserService.Entity.Role;

import lombok.Data;

import javax.validation.constraints.*;

import org.springframework.stereotype.Component;

@Component
@Data
public class UserDTO {

    private String Id;

    @NotNull(message = "Field 'First Name' cannot be null.")
    @NotBlank(message = "Field 'First Name' cannot be blank.")
    private String fName;

    @NotNull(message = "Field 'Last Name' cannot be null.")
    @NotBlank(message = "Field 'Last Name' cannot be blank.")
    private String lName;

    @NotNull(message = "Field 'Email' cannot be null.")
    @NotBlank(message = "Field 'Email' cannot be blank.")
    private String email;

    @NotNull(message = "Field 'Password' cannot be null.")
    @NotBlank(message = "Field 'Password' cannot be blank.")
    private String password;

    @NotBlank(message = "Field 'Phone Number' cannot be blank.")
    @Size(min = 10, max = 10, message = "Phone Number must be exactly 10 digits.")
    private String phoneNumber;


    private Role role;
}
