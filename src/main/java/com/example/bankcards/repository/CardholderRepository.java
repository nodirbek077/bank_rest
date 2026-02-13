package com.example.bankcards.repository;

import com.example.bankcards.entity.Cardholder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardholderRepository extends JpaRepository<Cardholder, Integer> {

}
