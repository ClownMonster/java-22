import java.util.*;

public class prime {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number to be checked");
      int a = sc.nextInt();
      boolean flag = true; /* initializing flag to true value */
      if(a==1 || a == 0)
      System.out.println(a+ " is not a prime number");
      else{
      for(int i=2; i<=a/2; i++)
         {
           if(a%i==0) flag = false; /* changing flag to flase value if not prime */
         }

         if(flag)
         System.out.println(a + " is a prime number");
         else
         System.out.println(a + " is not a prime number");
       sc.close();
    } 
    
  }

}


