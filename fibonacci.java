import java.util.*;

class fibonacci{
  
 public static int  with_recursion(int num1)
  {
    if(num1 == 0)
      return 0;
    else if(num1 == 1)
      return 1;
    else 
      return (with_recursion(num1-1) + with_recursion( num1-2));


  }
 
 public static void  without_recursion(int num2)
  {
    int n1=0, n2=1;
    System.out.println("Fibonacci Series Starts");
    if(num2 == 0)
    {
      System.out.println("0");
    }

    else if(num2 == 1) {
      System.out.println("0 1");
    }

    else
    { System.out.print("0 1");
      for(int i=2;i<num2;i++)
      {
        int n3 = n1 + n2;
        System.out.print(" " +n3);
        n1 = n2;
        n2 = n3;
      }
    }
     System.out.println("");
     System.out.println("End of Series");

  }

  public static void main(String args[])
  {

    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 to use without Recusrsion and 2 to use Recursion");
    int a = sc.nextInt();
    if(a==1){
      System.out.println("Enter the number to which fibonacci series is to be found");
      int number = sc.nextInt();
      without_recursion(number);
      sc.close();
    }

    else
    {
      System.out.println("Enter the number to which fibonacci series is to be found");
      int number = sc.nextInt();
      System.out.println("Start of series");
      for (int i=0;i<number;i++) {
        System.out.print(with_recursion(i)+ " ");
      }
      System.out.println(" ");
      System.out.println("End of series");
      sc.close();
    }  

  }


}