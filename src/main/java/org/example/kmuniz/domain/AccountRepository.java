package org.example.kmuniz.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{
	
	public Account findByAccountNumber(String str);
}
