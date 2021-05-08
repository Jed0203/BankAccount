import java.util.Scanner;

class BankAccount {
    int balance;
    int previousTransaction;

    
    void deposit(int amount){
        if(amount != 0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if(amount != 0)
        {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction(){
        if(previousTransaction > 0)
        {
            System.out.println("Deposit: " + previousTransaction);
        }
        else if(previousTransaction < 0)
        {
            System.out.println("Withdraw: " + Math.abs(previousTransaction));
        }
        else
        {
            System.out.println("No transaction occurred");
        }
    }

    void menu(){
        char option = '0';
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("A CheckBalance");
            System.out.println("B Deposit");
            System.out.println("C Withdraw");
            System.out.println("D Previous Transaction");
            System.out.println("E Exit");
            System.out.println("==============================");
            System.out.println("Enter an option");
            System.out.println("==============================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch(option)
            {
                case 'A','a':
                    System.out.println("==============================");
                    System.out.println("Balance = "+ balance);
                    System.out.println("==============================");
                    System.out.println("\n");
                    break;
                
                case 'B', 'b':
                    System.out.println("==============================");
                    System.out.println("Enter an amount to deposit:");
                    System.out.println("==============================");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                    
                case 'C', 'c':
                    System.out.println("==============================");
                    System.out.println("Enter an amount to withdraw:");
                    System.out.println("==============================");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                
                case 'D','d':
                    System.out.println("==============================");
                    getPreviousTransaction();
                    System.out.println("==============================");
                    System.out.println("\n");
                    break;

                case 'E','e':
                    System.out.println("-------------------------------");
                    break;
                
                default:
                    System.out.println("Invalid Option! Please enter again.\n");
                    break;    

            }
        }while(option != 'E');

        System.out.println("Thank you for using our services.");
    }
}