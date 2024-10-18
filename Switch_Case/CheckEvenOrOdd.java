import java.util.Scanner;
class CheckEvenOrOdd
{
   public static void main(String[] arg)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int num =sc.nextInt();
    switch(num%2){
    
      case 0 :
              System.out.println("Number is even");
              break;
      case 1: 
             System.out.println("Number is odd");
             break;
     default : 
              System.out.println("Negative value"); 
       }
      }
    }                 
