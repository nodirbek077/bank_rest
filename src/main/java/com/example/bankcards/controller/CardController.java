package com.example.bankcards.controller;

import com.example.bankcards.dto.CardholderDto;
import com.example.bankcards.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/card")
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;
    
    @PostMapping("/create")
    public HttpEntity<?> createCard(@RequestBody CardholderDto cardholderDto)  {
        return ResponseEntity.ok(cardService.createCard(cardholderDto.getCardholderId()));
    }
}
