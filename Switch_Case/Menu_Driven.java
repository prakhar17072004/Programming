import java.util.Scanner;
class Menu_Driven
{
  public static void main(String[] arg)
  {
  Scanner sc = new Scanner(System.in);
  int a,b,ch;
  
  System.out.println("1.Addition");
  System.out.println("2.Substraction");
  System.out.println("3.Multiplication");
  System.out.println("4.Division");
  System.out.println("5.Mod");
  
  System.out.println("Enter the imput");
  ch = sc.nextInt();
  
  switch(ch){
  
       case 1 :System.out.println("Enter the Number 1: ");
               a=sc.nextInt();
               System.out.println("Enter the Number 2: ");
               b=sc.nextInt();
               System.out.println("Addition = " + (a+b));
               break;
      
      case 2 :System.out.println("Enter the Number 1: ");
               a=sc.nextInt();
               System.out.println("Enter the Number 2: ");
               b=sc.nextInt();
               System.out.println("Substraction = " + (a-b));
               break;
     
     case 3 :System.out.println("Enter the Number 1: ");
               a=sc.nextInt();
               System.out.println("Enter the Number 2: ");
               b=sc.nextInt();
               System.out.println("Multiplication = " + (a*b));
               break;
      
      case 4 :System.out.println("Enter the Number 1: ");
               a=sc.nextInt();
               System.out.println("Enter the Number 2: ");
               b=sc.nextInt();
               System.out.println("Division = " + (a/b));
               break;
      
      case 5 :System.out.println("Enter the Number 1: ");
               a=sc.nextInt();
               System.out.println("Enter the Number 2: ");
               b=sc.nextInt();
               System.out.println("Mod = " + (a%b));
               break; 
       default: System.out.println("invalid input");
       
       
       
      } 
    } 
    
  }                          
                                  
