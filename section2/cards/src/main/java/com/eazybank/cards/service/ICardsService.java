package com.eazybank.cards.service;

import com.eazybank.cards.dto.CardDto;

public interface ICardsService {

    void createCard(String mobileNumber);
    CardDto fetchCard(String mobileNumber);
    boolean updateCard(CardDto cardsDto);
    boolean deleteCard(String mobileNumber);


}
