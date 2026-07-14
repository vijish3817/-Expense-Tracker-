package com.expensetracker.exception;

public class DuplicateBudgetException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public DuplicateBudgetException(String message) {
        super(message);
    }
}
