package com.eazybank.cards.dto;


import jakarta.validation.constraints.Pattern;
import lombok.Data;

/**
 * Lombok is a Java library that helps reduce the verbosity of Java code
 * by automatically generating boilerplate code through annotations.
 * @Data annotation, for instance, automatically generates getters, setters, equals(), hashCode(), and toString() methods for each field in a class.
 */
@Data
public class CardDto {
    private Long cardId;

    @Pattern(regexp = "[0-9]{10}", message = "Mobile Number cannot exceeds 10 digits!" )
    private String mobileNumber;

    private Long cardNumber;
    private String cardType;
    private int totalLimit;
    private int amountUsed;
    private int availableAmount;
}
