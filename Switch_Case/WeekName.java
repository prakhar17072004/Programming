import java.util.Scanner;
class WeekName
{
public static void main(String[] arg)
   { 
     //Scanner object creation
     Scanner sc = new Scanner(System.in);
     
     int dayName;
     
     //Enter the day
     System.out.println("Enter the day");
      dayName = sc.nextInt();
      
      switch(dayName){
      case 0:
              System.out.println("Sunday");
              break;
      case 1:
              System.out.println("Mondey");
              break;
     case 2:
              System.out.println("Tuesday");
              break; 
     case 3:
              System.out.println("Wednesday");
              break;             
     case 4:
              System.out.println("Thrusday");
              break;
                      
    case 5:
              System.out.println("Friday");
              break;
    case 6:
              System.out.println("Saturday");
              break;
    default:
              System.out.println("Invalid input");
              break; 
              
              }
             }
             
           }           
