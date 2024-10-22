import java.util.Scanner;
class GreatestOne

{
  public static void main(String[] arg)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number 1");
    int a= sc.nextInt();
    System.out.println("Enter the number 2");
    int b= sc.nextInt();
    System.out.println("Enter the number 3");
    int c= sc.nextInt();
    
    
    if(a>c)
    {
     System.out.println("Number 1 is greater");
     }
     else if(b>c)
     {
     System.out.println("Number 2 is greater");
     }
     else
     {
     System.out.println("Number 3 is greater");
     }
     
   }
 }    
    
    
