package com.codercampus.Assignment11.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.service.TransactionService;

@Controller
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	// Fetch transactions from repository to HTML view 
	@GetMapping("/transactions")
	public String getTransactions(ModelMap model) {

		List<Transaction> allTransactions = transactionService.findAll();
		//Transaction transaction = new Transaction();
		//model.put("transaction", transaction);
		model.put("transactions", allTransactions); // all transactions
        for ( Transaction transaction : allTransactions) {
        	System.out.println(transaction);
        }
		return "transactions";

	}
	
	@GetMapping("/transactions/{transactionId}")
	public String getTransaction(@PathVariable Long transactionId,
			                        ModelMap model) {
		
		Transaction transactionById = transactionService.findById(transactionId);
		model.put("transaction",transactionById);
		return "transactionbyid";
	}
	
	

}
