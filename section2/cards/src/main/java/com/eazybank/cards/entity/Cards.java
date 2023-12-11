package com.eazybank.cards.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


/**
 * @NoArgsConstructor -  You need a default constructor (constructor without any argument) in entities.
 * This is needed because JPA/Hibernate uses the default constructor method to create a bean class using reflections.
 * If you don't specify any constructor (nor Lombok annotation), Java will generate a default constructor
 * (automatically generated by the compiler if no constructors have been defined for the class).
 * But if you add a constructor with parameters (or @AllArgsConstructor),
 * then you'll need to add a no args constructor (or @NoArgsConstructor) as well, for JPA/Hibernate to work.
 */


/**
 * @Entity - In this code snippet, the Cards class is marked as an entity.
 * This means that there will be a table in the database corresponding to this class.
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
@Entity
public class Cards extends BaseEntity {

    @Id
    @Column(name="card_id")
    private Long cardId;

    @Column(name="mobile_number")
    private String mobileNumber;

    @Column(name="card_number")
    private Long cardNumber;

    @Column(name="card_type")
    private String cardType;

    @Column(name="total_limit")
    private int totalLimit;

    @Column(name="amount_used")
    private int amountUsed;

    @Column(name="available_amount")
    private int availableAmount;

}