import java.util.*;


public class account {
   static Scanner sc = new Scanner(System.in);
   int Account_no, Phone_no;
   float balance_amt = 4000, depoition_amt, withdrawn_amt;
   String Name;

  void getinput() {
    System.out.println("Enter the Account Number :");
    Account_no = sc.nextInt();
    System.out.println("Enter the Name :");
    Name = sc.nextLine();
    System.out.println("Enter Phone Number :");
    Phone_no = sc.nextInt();
    
  }

  void Deposit() {
    System.out.println("*****Deposition counter********");
    System.out.println("Enter the amount to be deposited");
    depoition_amt = sc.nextFloat();
    balance_amt += depoition_amt;
    System.out.println("***Thank you for depositing*******");
  
  }

  void Withdraw() {
    System.out.println("******withdrawalcounter*********");
    System.out.println("Enter the amount to be withdrawn");
    withdrawn_amt = sc.nextFloat();
    if(withdrawn_amt>balance_amt)
      System.out.println("Insufficient Balance");
    else
      {
        balance_amt -= withdrawn_amt;
      }

  }

  void printdetails() {

    System.out.println("**************HI { } Your Details: " + Name);
    System.out.println("Account Number : " +Account_no);
    System.out.println("Phone NUmber : " +Phone_no);
    System.out.println("Balance : " +balance_amt);
    


  }

  public static void main(String args[]) { 
    account o = new account();
    o.getinput();
    while(true){
    System.out.println("******Menu********");
    System.out.println("1.Depoition\n2.Withdraw\n3.Print Details\n4.exit");
    System.out.println("enter your choice:");
    int a = sc.nextInt();
    switch (a) {
      case 1: o.Deposit();
               break;
      case 2: o.Withdraw();
                break;
      case 3:o.printdetails();
                break;
      case 4: System.exit(0);
      default:System.out.println("Invalid choice");
              break;
                }
              }
    
    }

}
