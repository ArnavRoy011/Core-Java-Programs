//Write a Java program to calculate a Factorial of a number.
import java.util.Scanner;
class Factorial
{  
 public static void main(String args[])
 {  
  int i,fact=1;  
  int number;
System.out.println("Enter the number for Factorial");

// Create an object of Scanner class.
Scanner sc=new Scanner(System.in);
number=sc.nextInt();  
  for(i=1;i<=number;i++)
  {    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  