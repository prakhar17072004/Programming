import java.util.Scanner;
class DivisibleBy7And11
{
    public static void main(String[] arg)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no.");
      int a= sc.nextInt();
      
      if(a%7==0&&a%11==0)
      {
      System.out.println("No. is divisible");
      }
      else{
      System.out.println("No. is not divisible");
      }
      
      }
   }   
