package com.learning.service.QuoteService.DTOs;

import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class QuoteDTO {
	
    @NotBlank(message = "Field 'Quote' cannot be blank.")
	private String quote;

    @NotBlank(message = "Field 'Author' cannot be blank.")
	private String author;
}
