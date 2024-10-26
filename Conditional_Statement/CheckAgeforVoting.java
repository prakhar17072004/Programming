import java.util.Scanner;
class CheckAgeforVoting
{
 public static void main (String[] arg)
 {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the Age");
  int age = sc.nextInt();
  if(age>=18)
  {
    System.out.println("Person is valid for voting");
    }
    else
    {
    System.out.println("Person is not valid for voting");
    }
  }
}    
   
