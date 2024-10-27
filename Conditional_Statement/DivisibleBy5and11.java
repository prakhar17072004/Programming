import java.util.Scanner;
class DivisibleBy5And11
{

  public static void main (String[] arg) 
  {
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   if(a%5 && a%11)
     {
     System.out.println("Number is divisible by 5 and 11");
     }
     else 
     {
     System.out.println("Not divisible by 5 and 11");
     }
     
  }
  }
