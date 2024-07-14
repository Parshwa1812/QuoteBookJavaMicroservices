package com.learning.service.QuoteService.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.service.QuoteService.DTOs.QuoteDTO;
import com.learning.service.QuoteService.Service.QuoteService;

@RestController
@CrossOrigin
@RequestMapping("/quotes")
public class QuoteController {
	
	@Autowired
	private QuoteService quoteService;

	@PostMapping("/add-qquote/{userId}")
	public ResponseEntity<?> addQuote(@PathVariable String userId,@Valid @RequestBody QuoteDTO quotedto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(quoteService.addQuote(userId,quotedto));
	}
	
	@PutMapping("/edit-quote/{userId}/{quoteId}")
	public void editQuote(@PathVariable String userId,@PathVariable String quoteId)
	{
		
	}
	
	@DeleteMapping("/delete-quote/{userId}/{quoteId}")
	public void deleteQuote(@PathVariable String userId,@PathVariable String quoteId)
	{
		
	}
	
	@GetMapping("/get-all-quote")
	public void getAllQuotes()
	{
		
	}
	
	@GetMapping("/get-quotes-by-userid/{userId}")
	public void getQuoteByUserId(@PathVariable String userId)
	{
		
	}
}
