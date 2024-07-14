package com.learning.service.QuoteService.DTOs;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class QuoteResponseDTO {

	private String quote;

	private String author;
    
    private LocalDateTime dateTime;
}
