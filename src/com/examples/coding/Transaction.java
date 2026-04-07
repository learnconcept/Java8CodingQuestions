package com.examples.coding;

class Transaction {
    String userId;
    double amount;
    String type; // "credit" or "debit"

    Transaction(String userId, double amount, String type) {
        this.userId = userId;
        this.amount = amount;
        this.type = type;
    }
}
