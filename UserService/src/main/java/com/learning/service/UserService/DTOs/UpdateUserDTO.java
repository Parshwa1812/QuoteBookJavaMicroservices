package com.learning.service.UserService.DTOs;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class UpdateUserDTO {

	@NotNull(message = "Field 'First Name' cannot be null.")
    @NotBlank(message = "Field 'First Name' cannot be blank.")
    private String fName;

    @NotNull(message = "Field 'Last Name' cannot be null.")
    @NotBlank(message = "Field 'Last Name' cannot be blank.")
    private String lName;

    @NotNull(message = "Field 'Password' cannot be null.")
    @NotBlank(message = "Field 'Password' cannot be blank.")
    private String password;
}
