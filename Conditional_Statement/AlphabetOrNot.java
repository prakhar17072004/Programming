import java.util.Scanner;
class AlphabetOrNot
{
 public static void main(String[] arg)
 {
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter the alphabet");
   char ch = sc.next().charAt(0);
   
   if(ch >='a' && ch<='z'||ch>='A'&& ch<='Z')
   {
   System.out.println("Is  alphabet");
   }
   else{
   System.out.println("Not alphabet");
   }
   }
 }  
