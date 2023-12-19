package com.eazybank.cards.Repository;

import com.eazybank.cards.entity.Cards;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.Optional;

public interface CardsRepository extends JpaRepository<Cards, Long> {

    Optional<Cards> findByMobileNumber(String mobileNumber);


    @Transactional
    @Modifying
    void deleteCards(Long cards);

    Optional<Cards> findByCardNumber(Long cardNumber);
}
