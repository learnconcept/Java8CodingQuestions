package com.examples.coding;

import java.util.ArrayList;
import java.util.List;

public class MainTran {
    static void main() {
        /*U1 credit 100
        U1 debit  30
        U2 credit 200
        U1 credit 50
        U2 debit  70*/
        Transaction transaction1 = new Transaction("U1", 100, "Credit");
        Transaction transaction2 = new Transaction("U1", 30, "Debit");
        Transaction transaction3 = new Transaction("U2", 200, "Credit");
        Transaction transaction4 = new Transaction("U1", 50, "Credit");
        Transaction transaction5 = new Transaction("U2", 70, "Debit");
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        transactions.add(transaction4);
        transactions.add(transaction5);

        List<Transaction> creditTranU1 = transactions.stream().filter(i->i.type.equals("Credit")
                && i.userId.equals("U1")).toList();
        List<Transaction> creditTranU2 = transactions.stream().filter(i->i.type.equals("Credit")
                && i.userId.equals("U2")).toList();
        List<Transaction> debitTranU1 = transactions.stream().filter(i->i.type.equals("Debit")
                && i.userId.equals("U1")).toList();
        List<Transaction> debitTranU2 = transactions.stream().filter(i->i.type.equals("Debit")
                && i.userId.equals("U2")).toList();
        double creditAmountU1 = 0;
        double creditAmountU2 = 0;
        double debitAmountU1 = 0;
        double debitAmountU2 = 0;

        for (Transaction transaction : creditTranU1) {
            creditAmountU1+= transaction.amount;
        }
        for (Transaction transaction : debitTranU1) {
            debitAmountU1+= transaction.amount;
        }
        for(Transaction transaction : creditTranU2) {
            creditAmountU2+= transaction.amount;
        }
        for (Transaction transaction : debitTranU2) {
            debitAmountU2+= transaction.amount;
        }
        System.out.println("Total Credit amount for U1 "+creditAmountU1);
        System.out.println("Total Credit amount for U2 "+creditAmountU2);
        System.out.println("Total Debit amount for U1 "+debitAmountU1);
        System.out.println("Total Debit amount for U2 "+debitAmountU2);
        double balanceU1 = creditAmountU1 - debitAmountU1;
        double balanceU2 = creditAmountU2 - debitAmountU2;
        System.out.println("Final Balance of U1 "+(balanceU1));
        System.out.println("Final Balance of U2 "+(balanceU2));
        System.out.println("Highest Balance is "+ (balanceU1>balanceU2?balanceU1:balanceU2));


    }
}
