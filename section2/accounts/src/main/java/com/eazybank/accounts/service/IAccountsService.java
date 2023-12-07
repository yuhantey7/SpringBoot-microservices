package com.eazybank.accounts.service;

import com.eazybank.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customersDto - CustomerDto Object
     */

    void createAccount(CustomerDto customersDto);


    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Accounts Details based on a given mobileNumber
     */

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

}
