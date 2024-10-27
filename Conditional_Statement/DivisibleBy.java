import java.util.Scanner;
class DivisibleBy
{

  public static void main (String[] arg) 
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the name");
   int a = sc.nextInt();
   if(a%5==0 &&a%11==0)
     {
     System.out.println("Number is divisible by 5 and 11");
     }
     else 
     {
     System.out.println("Not divisible by 5 and 11");
     }
     
  }
  }
