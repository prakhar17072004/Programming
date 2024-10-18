import java.util.Scanner;
class Number_Of_Days
{
 public static void main(String[] arg)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the month");
   int mon = sc.nextInt();
   switch(mon){
   
       case 1:
       case 3:
       case 5:
       case 7:
       case 8:
       case 10:
       case 12:
               System.out.println("Number of days are 31");
               break;
       case 4:
       case 6:
       case 9:
      case 11:
                System.out.println("Number of days are 30");
                break;
                
                
       case 2: 
                System.out.println("Number of days are 28");
                System.out.println("Number of days are 29 in leap year"); 
                break;
      default: 
                 System.out.println("Please enter the valid input");
                 
                 
                 
               }
               
             }
             
           }                         
               
       
   
