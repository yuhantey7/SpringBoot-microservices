package com.eazybank.mapper;

import com.eazybank.cards.dto.CardDto;
import com.eazybank.cards.entity.Cards;


/**
 * This just more understanding by me
 public class Main {
 // Static method
 static void myStaticMethod() {
 System.out.println("Static methods can be called without creating objects");
 }

 // Public method
 public void myPublicMethod() {
 System.out.println("Public methods must be called by creating objects");
 }

 // Main method
 public static void main(String[ ] args) {
 myStaticMethod(); // Call the static method
 // myPublicMethod(); This would output an error

 Main myObj = new Main(); // Create an object of Main
 myObj.myPublicMethod(); // Call the public method
 }
 }
 */

public class CardsMapper {

    public static CardDto mapToCards(CardDto cardDto, Cards cards) {
        cardDto.setCardNumber(cards.getCardNumber());
        cardDto.setTotalLimit(cards.getTotalLimit());
        cardDto.setMobileNumber(cards.getMobileNumber());
        cardDto.setCardType((cards.getCardType()));
        return cardDto;
    }
    public static Cards mapToCardsDto(Cards cards, CardDto cardDto) {
        cards.setCardNumber(cardDto.getCardNumber());
        cards.setTotalLimit(cardDto.getTotalLimit());
        cards.setMobileNumber(cardDto.getMobileNumber());
        cards.setCardType((cardDto.getCardType()));
        return cards;
    }
}
