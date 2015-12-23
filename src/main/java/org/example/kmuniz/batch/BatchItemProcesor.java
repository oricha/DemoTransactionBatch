package org.example.kmuniz.batch;

import org.example.kmuniz.domain.Account;
import org.example.kmuniz.domain.AccountRepository;
import org.example.kmuniz.domain.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;


public class BatchItemProcesor implements ItemProcessor<Transaction,Transaction>{
	
	private static final Logger log = LoggerFactory.getLogger(BatchItemProcesor.class);
	
	@Autowired
	private AccountRepository a_repository;

	@Override
	public Transaction process(Transaction itemTrasaction) throws Exception {
		
		Account account = a_repository.findByAccountNumber(itemTrasaction.getAccount_id());
		if( account != null){
			account.setAmount( account.getAmount().add(itemTrasaction.getAmount()));
			a_repository.save(account);
			
			log.info("Updated Transaction " + account.getAccount_number());
		}

		
		return itemTrasaction;
	}

}
