package com.eazybank.cards.service;

import com.eazybank.cards.dto.CardDto;

public interface ICardsService {

    void createCard(CardDto cardDto);
    CardDto fetchCard();
    boolean updateCard();
    boolean deleteCard();


}
