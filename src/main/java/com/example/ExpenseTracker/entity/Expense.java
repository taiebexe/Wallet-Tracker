package com.example.ExpenseTracker.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Getter  // ✅ Generates getters automatically
@Setter  // ✅ Generates setters automatically
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;      // ✅ Ensure this exists
    private String category;   // ✅ Ensure this exists
    private Double amount;     // ✅ Ensure this exists
    private LocalDate date;    // ✅ Ensure this exists
    private String description; // ✅ Ensure this exists
}
