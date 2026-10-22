package com.finFlow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Account {
    public Account(){}

   @Id
   @GeneratedValue (strategy = GenerationType.AUTO)
   private Long id;

   @Getter
   @Setter
   @Column(nullable = false)
   private String holderName;

   @Column(nullable = false, precision = 19, scale =2 )
    private BigDecimal balance = BigDecimal.ZERO;

   @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

}
