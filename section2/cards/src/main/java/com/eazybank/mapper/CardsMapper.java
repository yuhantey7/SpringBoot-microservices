package com.eazybank.mapper;

import com.eazybank.cards.dto.CardDto;
import com.eazybank.cards.entity.Cards;


/**
 * If the method doesn't need to access or modify the internal state of an instance,
 * and it's intended to be a utility method for mapping without relying on object-specific
 * state, you can make it static.
 * If the method needs access to the state of an instance and is part of the behavior of
 * an object, it should be non-static.
 * In the context of mapping operations, where the method doesn't rely on the state of
 * an instance, making it static is a common and often appropriate choice. However,
 * if you need to access or modify the state of an instance during the mapping, a
 * non-static method might be more appropriate.
 */

public class CardsMapper {

    public CardDto mapToCards(CardDto cardDto, Cards cards) {


    }
    public CardDto mapToCardsDto(Cards cards, CardDto cardDto) {

    }


}
