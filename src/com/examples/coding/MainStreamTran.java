package com.examples.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainStreamTran {
    static void main() {
/*
        Total Credit
        Total Debit
        Final Balance
        Return Top User with Highest Balance
        Expected Output
        U1 -> Credit:150 Debit:30 Balance:120
        U2 -> Credit:200 Debit:70 Balance:130*/
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

        Double debitU1=transactions.stream().filter(i->i.type.equals("Debit") && i.userId.equals("U1"))
                                .mapToDouble(a->a.amount).sum();
        Double debitU2=transactions.stream().filter(i->i.type.equals("Debit") && i.userId.equals("U2"))
                                .mapToDouble(a->a.amount).sum();
        Double creditU1=transactions.stream().filter(i->i.type.equals("Credit") && i.userId.equals("U2"))
                .mapToDouble(a->a.amount).sum();
        Double creditU2=transactions.stream().filter(i->i.type.equals("Credit") && i.userId.equals("U2"))
                .mapToDouble(a->a.amount).sum();
        System.out.println("DebitU1:"+debitU1);
        System.out.println("DebitU2:"+debitU2);
        System.out.println("CreditU1:"+creditU1);
        System.out.println("CreditU2:"+creditU2);

        Map<String, List<Transaction>> list = transactions.stream().collect(Collectors.groupingBy(t->t.userId));

    }
}
