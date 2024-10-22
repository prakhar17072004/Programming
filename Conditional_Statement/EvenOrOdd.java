import java.util.Scanner;
class EvenOrOdd
{

 public static void main(String[] arg)
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int a= sc.nextInt();
     
     if(a%2==0)
     {
     System.out.println("no.is even");
     }
     else{
     System.out.println("No. is odd");
     }
     
   }
 }    
