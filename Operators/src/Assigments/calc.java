package Assigments;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operation (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error! Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Error! Invalid operator.");
            return;
        }

        System.out.println("Result: " + result);
    }

    public static class Account {
        private String accountNumber;
        private String accountHolderName;
        private double balance;

        // Constructor
        public Account(String accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        // I will create method to display account details
        public void displayAccountDetails() {
            System.out.println("Assigments.calc.Account Number: " + accountNumber);
            System.out.println("Assigments.calc.Account Holder Name: " + accountHolderName);
            System.out.println("Balance: $" + balance);
        }

        public static void main(String[] args) {
            // I will Create and initialize two objects of Assigments.calc.Account class
            Account account1 = new Account("0100045", "Dee Emmanuel ", 1000);
            Account account2 = new Account("0100034", "Achiek Dee", 500);

            // I will print or Display details of account1
            System.out.println("Details of Assigments.calc.Account 1:");
            account1.displayAccountDetails();
            System.out.println();

            // I will print or Display details of account2
            System.out.println("Details of Assigments.calc.Account 2:");
            account2.displayAccountDetails();
        }
    }
}
