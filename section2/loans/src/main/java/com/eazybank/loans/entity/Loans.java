package com.eazybank.loans.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Loans extends BaseEntity{

        @Id
        @Column(name="loan_id")
        private int loanId;
        @Column(name="mobile_number")
        private String mobileNumber;
        @Column(name="loan_number")
        private String loanNumber;
        @Column(name="loan_type")
        private String loanType;
        @Column(name="total_loan")
        private int totalLoan;
        @Column(name="amount_paid")
        private int amountPaid;
        @Column(name="outstanding_amount")
        private int outstandingAmount;

}
