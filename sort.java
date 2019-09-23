import java.util.*;

class sort{

  void sort(int A[])
  {
    int n = A.length;
    for(int i=0;i<n-1;i++)
      for(int j=0;j<n-i-1;j++)
       if(A[j] > A[j+1])
        {
          int temp = A[j];
          A[j] = A[j+1];
          A[j+1] = temp;
        }        
  }

  void print(int A[])
  { int n = A.length;
    for(int i=0;i<n;i++)
    System.out.print(A[i] +" ");

  }

  public static void main(String args[])
  { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    System.out.println("Enter the elments of the array");
    int A[] = new int[size];
    for(int i=0;i<size;i++){
     A[i] = sc.nextInt();}
    sort o = new sort();
    o.sort(A);
    System.out.println("Sorted array :");
    o.print(A);
    sc.close();



  }




}