package com.eazybank.accounts.service.impl;

import com.eazybank.accounts.controller.entity.Accounts;
import com.eazybank.accounts.controller.entity.Customer;
import com.eazybank.accounts.dto.CustomerDto;
import com.eazybank.accounts.exception.CustomerAlreadyExistsException;
import com.eazybank.accounts.mapper.CustomerMapper;
import com.eazybank.accounts.repository.AccountsRepository;
import com.eazybank.accounts.repository.CustomerRepository;
import com.eazybank.accounts.service.IAccountsService;
import com.eazybank.accounts.constant.AccountsConstants;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class AccountsSerrvicceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;


    @Override
    public void createAccount(CustomerDto customersDto) throws CustomerAlreadyExistsException {
        Customer customer = CustomerMapper.mapToCustomer(customersDto, new Customer());
        Optional<Customer> optionalCustomer = customerRepository.findByMobileNumber(customersDto.getMobileNumber());
        if (optionalCustomer.isPresent()) {
            throw new CustomerAlreadyExistsException("Customer is already registered with given mobileNumber"
                    + customersDto.getMobileNumber());
        }
        Customer savedCustomer = customerRepository.save(customer);
        accountsRepository.save(createNewAccount(savedCustomer));
    }

    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000000L* new Random().nextInt(900000000);
        newAccount.setAccountNumber(randomAccNumber);

        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        return newAccount;
    }

}
