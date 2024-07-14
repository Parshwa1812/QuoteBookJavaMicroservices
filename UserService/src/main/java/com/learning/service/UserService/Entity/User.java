package com.learning.service.UserService.Entity;


import javax.persistence.*;

import javax.validation.constraints.*;

import lombok.Data;


@Data
@Entity
@Table(name="ms_user_tb")
public class User {

    @Id
    private String id;

    @NotNull(message = "Field 'First Name' cannot be null.")
    @NotBlank(message = "Field 'First Name' cannot be blank.")
    private String fName;

    @NotNull(message = "Field 'Last Name' cannot be null.")
    @NotBlank(message = "Field 'Last Name' cannot be blank.")
    private String lName;

    @NotNull(message = "Field 'Email' cannot be null.")
    @NotBlank(message = "Field 'Email' cannot be blank.")
    @Column(unique = true)
    private String email;

    @NotNull(message = "Field 'Password' cannot be null.")
    @NotBlank(message = "Field 'Password' cannot be blank.")
    private String password;

    @NotBlank(message = "Field 'Phone Number' cannot be blank.")
    @Size(min = 10, max = 10, message = "Phone Number must be exactly 10 digits.")
    @Column(unique = true,length = 10)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Role role;
}
