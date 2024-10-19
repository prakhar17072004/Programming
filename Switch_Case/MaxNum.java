import java.util.Scanner;
class MaxNum
{

 public static void main(String[] arg)
 {
 
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number1: ");
    int a = sc.nextInt();
    System.out.println("Enter the Number2: ");
    int b = sc.nextInt();
    int res = a>b?1:0;
    switch(res){
         case 0 : 
                 res = a==b?1:0;
                 switch(res){
                      case 0:
                             System.out.println(" Number 1 is greater than Number 2" +b);
                              break;
                      case 1: System.out.println("Number 1 and Number 2 is equal "+a + " and " + b );        
                               break;
                               
                            } 
                            break;  
         case 1 : System.out.println(" Number 1 is greater than Number 2" +a);
                 break;        
                 
                 
                
                
                }
                
             }
           
           }  
