package com.learning.service.UserService.ExceptionHandler;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ExceptionResponse {

    private LocalDateTime timestamp;
    private String message;
    private String details;

}
