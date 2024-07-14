package com.learning.service.QuoteService.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name="ms_quote_tb")
public class Quote {
    
	@Id
	private String quoteId;
	
	@NotBlank(message = "Field 'Quote' cannot be blank.")
	private String quote;
	
	@NotBlank(message = "Field 'Quote' cannot be blank.")
	private String Author;
	
	@NotBlank(message = "Field 'Timestamp' cannot be blank.")
	private LocalDateTime timestamp;
	
	private Long likecount;
}
