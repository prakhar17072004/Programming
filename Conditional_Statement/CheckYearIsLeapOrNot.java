import java.util.Scanner;
class CheckYearIsLeapOrNot
 {
  public static void main(String[] arg)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year");
    int year = sc.nextInt();
    
    if(year%400==0)
    {
         System.out.println(year+ " is leap year");
    }
    else if(year %100!=0)
           {
             if(year%4==0)
             {
              System.out.println(year+ " is leap year");
              }
              else {
              System.out.println(year+ " is not leap year");  
              } 
            }
       else{
        System.out.println(year+ " is not leap year");   
          }
          
        }
        
      }      
              
