import java.util.Scanner;
class ArithmeticOperation
{
public static void main(String[] arg)
{
//Object creation of Scanner class
 Scanner sc = new Scanner(System.in);
 double result;
 
 //Enter operators
 System.out.println("Select the operator +,-,/,*,%");
 char oper = sc.next().charAt(0);
 
 
 //Enter the numbers
 System.out.println("Enter the numbers");
 double a=sc.nextDouble();
 double b = sc.nextDouble();
 switch(oper){
   case '+' :
              result= a+b;
             System.out.println("Sum of " +a+ "and" + b+ " is " + result);
             break;
   case '-' :result= a-b;
             System.out.println("Sum of " +a+ "and" + b+ " is " + result);
             break;          
 
   case '*' :result= a*b;
             System.out.println("Sum of " +a+ "and" + b+ " is " + result);
             break;
 
   case '/' :result= a/b;
             System.out.println("Sum of " +a+ "and" + b+ " is " + result);
             break;  
              
   case '%' :result= a%b;
             System.out.println("Sum of " +a+ "and" + b+ " is " +result);
             break;
    
   default :System.out.println("No operator present");
          }  
    
  
       }
   }        
