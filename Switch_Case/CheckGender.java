import java.util.Scanner;
class CheckGender
{
 public static void main(String[] arg)
 {
   Scanner sc = new Scanner(System.in);
   
   //Enter the gender
   System.out.println("Enter the gender");
   char gen =sc.next().charAt(0);
   
   switch(gen){
      
      case 'F':
      case 'f':
               System.out.println("Female");
               break;
      case 'M':
      case 'm':
               System.out.println("Male");
               break;
      default :
               System.out.println("Unspecified gender");
                 
                }
              }
              
            }                      
