package com.learning.service.QuoteService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.service.QuoteService.Entity.Quote;

public interface QuoteRepo extends JpaRepository<Quote, String> {

}
