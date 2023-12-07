package com.eazybank.accounts.repository;

import com.eazybank.accounts.controller.entity.Accounts;
import com.eazybank.accounts.controller.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long > {
}
