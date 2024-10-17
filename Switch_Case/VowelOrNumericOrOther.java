import java.util.Scanner;
class VowelOrNumericOrOther
{

  public static void main(String[] arg)
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the character ");
  
   char ch = sc.nextLine().charAt(0);
  
    switch(ch)
    {
    
    case 'a' :
    case 'e' :
    case 'i' :
    case 'o' :
    case 'u' :
              System.out.println("character is vowel");
              break;
     case '0'  : 
     case '1' : 
     case '2' :
     case '3' :
     case '4' : 
     case '5' : 
     case '6' : 
     case '7'  : 
     case '8' : 
     case '9' :
              System.out.println("character is Number");
              break;
     default:
               System.out.println("character is other");
                         
        }
     }
   }     
