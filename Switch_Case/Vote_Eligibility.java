import java.util.Scanner;
class Vote_Eligibility
{
 public static void main(String[] arg)
 {
 Scanner sc = new Scanner(System.in);
 
 int age;
 
 System.out.println("Enter the age");
 age= sc.nextInt();
 
 int result = age>=18?1:0;
 switch(result){
          case 0 :System.out.println("Prerson is not eligible for vote");
                   break;
          
          case 1 :System.out.println("Prerson is  eligible for vote");
                   break;
          
          default: System.out.println("Invalid input");
          
          }
        }
      }              
                           
