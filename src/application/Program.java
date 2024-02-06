package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {


        /*
        INSTANCIANDO O OBJETO ACCOUNT COM A CLASS ACCOUNT
        ocasionará um erro porque a class Account é Abstract
        classes abstratas não podem ser instanciadas
        tudo precisa ser avaliado de acordo com as regras de negócio
        Importante criar a classe Account por conta do REUSO e POLIMORFISMO

        Account acc1 = new Account(1001, "Alex", 1000.0);

        */

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
        list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1004, "Anna", 500.00, 500.00));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc : list) {
            acc.deposit(10.0);
        }

        for (Account acc : list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }
}