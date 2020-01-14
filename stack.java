import java.util.*;

public class stack{

    int Stack[]; /*global stack */
    static int  top = -1; /* static variables so as to access easily in the static methods */
    static Scanner sc = new Scanner(System.in); /* static so as to access easily in the static methods */

    stack(int size) /*constructor to initialize the stack of required size */
    {
      Stack =  new int[size];/* initializing the stack with the users input size */
    }


  void push(int size)
  {
    if(top == size -1)
    {
      System.out.println("Stack Overflow");
      return;

    }
    else{
      System.out.println("Enter the Element to push into the stack");

      Stack[++top] = sc.nextInt();/* pre-increement of the top and pushing the data element into the stack */
      return;
    }
  }

  int pop()
  {
    if(top == -1)
    {
      System.out.println("Stack Underflow");
      return -1;

    }

    else{
      return  Stack[top--]; /* deleting the top element and post decreement of top valu */
      
    }
  }

  void display()
  { 
    if(top == -1)
    {
      System.out.println("Stack is Empty");
      return;
    }
    else{
      for(int i=0;i<=top;i++)
      {
        System.out.print(" " +Stack[i]+ " ");

      }
    }
  }

public static void main(String argss[])
{
  System.out.println("Enter the Size of the stack");
  int size = sc.nextInt();
  stack o = new stack(size); /* creating the object refernce to the class and calling the constructor for the initialization */
  while(true)
  {
    System.out.println("*******Stack Menu********");
    System.out.println("1.Push\n2.Pop\n3.Display\n4.exit");
    System.out.println("Enter your choice");
    int a = sc.nextInt();
    switch (a) {
      case 1: o.push(size);
              break;
      case 2 : del = o.pop();
               if(del>=0)
               {
                  System.out.println(del+" is the poped Element from the stack");

               }        
               break;
      case 3:o.display();
             break;
      case 4:System.exit(0);
      default:System.out.println("Invalid choice");
              break;
    }

  }

}


}
