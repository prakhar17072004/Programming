import java.util.Scanner;
class Grading
{
public static void main(String [] agr)
{
  Scanner sc = new Scanner(System.in);
  
  //enter the grade
  System.out.println("Enter the grade");
  char ch = sc.next().charAt(0);
  System.out.println("Grade is : " +ch);
  switch(ch){
    case 'A' :
                System.out.println("Excellent");
                break;
     case 'B' :
                System.out.println("Welldone");
                break;
  
   case 'C' :
                System.out.println("Very Good");
                break;
  
   case 'D' :
                System.out.println("Good");
                break;
  
   case 'E' :
                System.out.println("Average");
                break;
  
  
   case 'F' :
                System.out.println("Fail");
                break;
  
   default : System.out.println("Invalid grade");
   
   }
  }
}   
