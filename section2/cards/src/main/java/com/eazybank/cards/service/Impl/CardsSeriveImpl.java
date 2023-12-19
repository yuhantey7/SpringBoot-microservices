package com.eazybank.cards.service.Impl;

import com.eazybank.cards.Repository.CardsRepository;
import com.eazybank.cards.dto.CardDto;
import com.eazybank.cards.entity.Cards;
import com.eazybank.cards.service.ICardsService;
import com.eazybank.constants.CardsConstants;
import com.eazybank.exception.CardAlreadyExistsException;
import com.eazybank.exception.CardNotFoundException;
import com.eazybank.mapper.CardsMapper;

import java.util.Optional;
import java.util.Random;

public class CardsSeriveImpl implements ICardsService {

    private CardsRepository cardsRepository;

    @Override
    public void createCard(String mobileNumber) throws CardAlreadyExistsException {
        Optional<Cards> optionalCards = cardsRepository.findByMobileNumber(mobileNumber);
        if (optionalCards.isPresent()) {
            throw new CardAlreadyExistsException("Card is already exits: " + mobileNumber, null);
        }
        cardsRepository.save(createNewCard(mobileNumber));
    }

    private Cards createNewCard(String mobileNumber) {
        Cards newCard = new Cards();
        long randomCardNumber = 100000000000L + new Random().nextInt(900000000);
        newCard.setCardNumber(Long.valueOf(Long.toString(randomCardNumber)));
        newCard.setMobileNumber(mobileNumber);
        newCard.setCardType(CardsConstants.CREDIT_CARD);
        newCard.setTotalLimit(Integer.parseInt(CardsConstants.NEW_CARD_LIMIT));
        newCard.setAmountUsed(0);
        newCard.setAvailableAmount(Integer.parseInt(CardsConstants.NEW_CARD_LIMIT));
        return newCard;
    }

    @Override
    public CardDto fetchCard(String mobileNumber) {
        Cards card = cardsRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new CardNotFoundException("Card is not exist: " + mobileNumber)
        );
        return CardsMapper.mapToCards(card, new CardDto());
    }

    @Override
    public boolean updateCard(CardDto cardsDto) {
        Cards cards = cardsRepository.findByCardNumber(cardsDto.getCardNumber()).orElseThrow(
                () -> new CardNotFoundException(cardsDto.getCardNumber().toString()));
        CardsMapper.mapToCards(cards, cardsDto);
        cardsRepository.save(cards);
        return  true;
    }

    @Override
    public boolean deleteCard(String mobileNumber) {
        Cards card = cardsRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new CardNotFoundException(mobileNumber)
        );
        cardsRepository.deleteCards(card.getCardId());
        return true;
    }
}
