package com.codercampus.Assignment11.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepo;

	public List<Transaction> findAll() {
		List<Transaction> sortedTransaction = 
				transactionRepo.findAll()
				.stream()
				.sorted(Comparator.comparing(Transaction::getDate))
				.collect(Collectors.toList());
		
		return sortedTransaction;
	}
	

	
	public  Transaction findById(Long transactionId) {
		
		return transactionRepo.findAll()
		.stream()
		.filter(id -> id.getId().equals(transactionId))
		.findFirst()
		.orElse(null);
	}
//		for (Transaction transaction:transactionRepo.findAll()) {
//			if(transaction.getId().equals(transactionId)) {
//				return  transaction;
//			}
//		}
//		return null;

}
