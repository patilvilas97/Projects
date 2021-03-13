import java.util.Scanner;

public class BankingApplication{
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("Vilas Patil", 996051);
        obj1.showMenu();
    }
}
class BankAccount{
    int amount = 0;
    int balance = 0;
    int previousTransaction = 0;
    String customerName;
    int customerId;
    
    BankAccount(String cName, int cId){
        customerName = cName;
        customerId = cId;
    }

    void deposit(int amount){
        balance += amount;
        previousTransaction = amount;
    }

    void withdraw(int amount){
        balance -= amount;
        previousTransaction = -amount;
    }

    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited : " + previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Withdrawn : " + Math.abs(previousTransaction));
        }
        else{
            System.out.println("No Previous Transaction");
        }
    }

    void showMenu(){
        char option = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("===================================================================");
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerId);
        System.out.println("\n");
        System.out.println("A : Check Balance");
        System.out.println("B : Deposit");
        System.out.println("C : Withdraw");
        System.out.println("D : Get Your Previous Transaction");
        System.out.println("E : Exit");

        do{
            System.out.println("===============================================================");
            System.out.print("Enter an Option : ");
            option = scan.next().charAt(0);
            switch(option){
                case 'A' : 
                    System.out.println("Your Balance is : " + balance);
                    break;
                case 'B' :
                    System.out.print("Please Enter an Amount to Deposit : ");
                    amount = scan.nextInt();
                    deposit(amount);
                    break;
                case 'C' :
                    System.out.print("Please Enter an Amount tobe Withdrawn : ");
                    amount = scan.nextInt();
                    withdraw(amount);
                    break;
                case 'D' :
                    getPreviousTransaction();
                    break;
                case 'E' :
                    System.out.println("===============================================================");
                    System.out.println("Thank You for using our Services!");
                    break;
                default : 
                    System.out.println("This is an Invalid Input");
            }
        }while(option !='E');
        // System.out.println();
    }
}
