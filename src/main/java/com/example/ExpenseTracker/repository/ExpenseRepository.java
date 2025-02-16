package com.example.ExpenseTracker.repository;


import com.example.ExpenseTracker.entity.Expense;
import org.hibernate.event.service.spi.JpaBootstrapSensitive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

}
