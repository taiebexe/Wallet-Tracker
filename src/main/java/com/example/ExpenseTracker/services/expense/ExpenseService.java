package com.example.ExpenseTracker.services.expense;

import com.example.ExpenseTracker.dto.ExpenseDTO;
import com.example.ExpenseTracker.entity.Expense;

public interface ExpenseService {  // FIXED: Renamed correctly
    Expense postExpense(ExpenseDTO expenseDTO);
}