import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        //BankAccount obj1 = new BankAccount("ABC","BA07966");
        BankAccount myObj = new BankAccount();
        Scanner obj1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter user Name and ID:");

        String userName = obj1.nextLine();  // Read user input
        int userId = obj1.nextInt();
        System.out.println("Welcome " + userName);  // Output user input
        System.out.println("Your User ID is :" + userId);
        System.out.println("");
        myObj.menu();

    }
}



