import java.util.Scanner;
 

class Table
{
  public static void main(String args[])
  {
    int n, c;
    System.out.println("Enter an integer to print it's Multiplication table: ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    System.out.println("Multiplication table of " + n);
 
   for (c = 1; c <= 10; c++)
      System.out.println(n + "*" + c + " = " + (n*c));
  }
}
