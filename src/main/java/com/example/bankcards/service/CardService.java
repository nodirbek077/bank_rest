package com.example.bankcards.service;

import com.example.bankcards.entity.Card;
import com.example.bankcards.entity.Cardholder;
import com.example.bankcards.entity.enums.CardStatus;
import com.example.bankcards.repository.CardRepository;
import com.example.bankcards.repository.CardholderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository cardRepository;
    private final CardholderRepository cardholderRepository;

    public Card createCard(Integer cardholderId) {
        Optional<Cardholder> cardholderExists = cardholderRepository.findById(cardholderId);
        if (cardholderExists.isEmpty()) {
            System.out.println("Cardholder not found");
            return null;
        }

        Cardholder cardholder = cardholderExists.get();

        Card newCard = new Card();
        String generatedCardNumber = generateCardNumber();
        newCard.setCardNumber(generatedCardNumber);

        newCard.setCardholder(cardholder);
        newCard.setExpiryDate(LocalDateTime.now().plusYears(5));
        newCard.setStatus(CardStatus.ACTIVE);
        newCard.setBalance(BigDecimal.ZERO);

        return cardRepository.save(newCard);
    }

    private String generateCardNumber() {
        return "860012345678" + (int) (Math.random() * 9000 + 1000);
    }

    public Card getCardById() {
        return null;
    }

    public Card updateCard(Card card) {
        return null;
    }

    public Card deleteCard() {
        return null;
    }
}
