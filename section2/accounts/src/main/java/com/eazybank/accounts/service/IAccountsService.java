package com.eazybank.accounts.service;

import com.eazybank.accounts.dto.CustomerDto;
public interface IAccountsService {

    /**
     *
     * @param customersDto - CustomerDto Object
     */

    void createAccount(CustomerDto customersDto);
}
