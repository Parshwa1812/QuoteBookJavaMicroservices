package com.learning.service.QuoteService.Service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.service.QuoteService.DTOs.QuoteDTO;
import com.learning.service.QuoteService.DTOs.QuoteResponseDTO;
import com.learning.service.QuoteService.Repository.QuoteRepo;

public class QuoteService {

	@Autowired
	private QuoteRepo quoteRepo;

	public QuoteResponseDTO addQuote(String userId, @Valid QuoteDTO quotedto) {
		
		return null;
	}

}
