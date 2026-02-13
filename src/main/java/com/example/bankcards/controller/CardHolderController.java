package com.example.bankcards.controller;

import com.example.bankcards.entity.Cardholder;
import com.example.bankcards.service.CardHolderService;
import com.example.bankcards.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cardholder")
@RequiredArgsConstructor
public class CardHolderController {
    private final CardHolderService cardHolderService;

    @PostMapping("/create")
    public HttpEntity<?> createCardholder(@RequestBody Cardholder cardholder)  {
        return ResponseEntity.ok(cardHolderService.createCardholder(cardholder));
    }
}
