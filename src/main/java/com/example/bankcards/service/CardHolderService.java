package com.example.bankcards.service;

import com.example.bankcards.entity.Cardholder;
import com.example.bankcards.repository.CardholderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CardHolderService {
    private final CardholderRepository cardholderRepository;

    public Cardholder createCardholder(Cardholder cardholder) {
        cardholder.setCards(null);
        cardholder.setFirstname(cardholder.getFirstname());
        cardholder.setLastname(cardholder.getLastname());
        cardholder.setMiddleName(cardholder.getMiddleName());
        cardholder.setCreatedDate(LocalDateTime.now());
        cardholder.setIsActive(true);
        return cardholderRepository.save(cardholder);
    }
}
