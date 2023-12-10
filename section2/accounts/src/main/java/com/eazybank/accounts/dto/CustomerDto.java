package com.eazybank.accounts.dto;


import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max= 30, message = "The length of the customer name should be between 5 or 30")
    private String name;

    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;


//  @Pattern(regexp = "^$|[0-9]{10}"])
    @Pattern(regexp = "\\d{10}", message = "Mobile number must be 10 digits" )
    private String mobileNumber;
    private AccountsDto accountsDto;
}
