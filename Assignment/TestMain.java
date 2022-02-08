//1)Write a program for ::below cases to handle wrong operations done by customers in deposit, and withdrawal
// operations.
//Case 1)CREATE an  InvalidAmountException if the user enters zero or –ve amount in deposit and
// withdraw operations.
//Case 2)Throw InsufficientBalanceException if the user enters the amount greater than the
// balance in case of withdrawing operations

package Week4.Session15.Assignment;

import java.util.Scanner;

class Account {
    String name;
    double balance;

    Account(String name , double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit (double amountToDeposit) throws InvalidAmountException {
        if(amountToDeposit <= 0)
            throw new InvalidAmountException("Amount to deposit cannot be zero or negative");
        else
            this.balance  += amountToDeposit;
        System.out.println(amountToDeposit+" Deposited");
    }

    public void withdraw (double amountToWithdraw) throws InvalidAmountException,InsufficientBalanceException {
        if(amountToWithdraw <= 0)
            throw new InvalidAmountException("Amount to deposit cannot be zero or negative");
        else if(amountToWithdraw > this.balance)
            throw new InsufficientBalanceException("Sorry ... Low Funds ....");
        else
            this.balance -= amountToWithdraw;
        System.out.println(amountToWithdraw+" Withdrawn");

    }

}
public class TestMain {
    public static void main(String[] args) throws InvalidAmountException, InsufficientBalanceException {
        Scanner scanner = new Scanner(System.in);
        Account[] array = new Account[3];
        Account obj_1 = new Account("Ashraf",1000);
        array[0] = obj_1;
        Account obj_2 = new Account("Eoin",1500);
        array[1] = obj_2;
        Account obj_3 = new Account("DK",2000);
        array[2] = obj_3;

        for(int i =0 ;i< array.length;i++) {
            try {
                System.out.println("Enter the amount to withdraw");
                int amount = scanner.nextInt();
                obj_1.withdraw(amount);

                try {
                    System.out.println("Enter the amount to Deposit");
                    amount = scanner.nextInt();
                    obj_1.deposit(amount);
                } catch (InvalidAmountException e) {
                    System.out.println("Invalid Amount Exception ");
                }
            } catch (InsufficientBalanceException e) {
                System.out.println("Insufficient Amount Exception ");
            } finally {
                System.out.println("TRANSACTION COMPLETED");
            }

        }


    }

}

/*
Enter the amount to withdraw
1100
Parameter String msg :: InsufficientBalanceException Sorry ... Low Funds ....
Insufficient Amount Exception
TRANSACTION COMPLETED

Enter the amount to withdraw
500
500.0 Withdrawn
Enter the amount to Deposit
-100
Parameter String msg :: InvalidAmountException Amount to deposit cannot be zero or negative
Invalid Amount Exception
TRANSACTION COMPLETED

Enter the amount to withdraw
100
100.0 Withdrawn
Enter the amount to Deposit
000
Parameter String msg :: InvalidAmountException Amount to deposit cannot be zero or negative
Invalid Amount Exception
TRANSACTION COMPLETED


* */