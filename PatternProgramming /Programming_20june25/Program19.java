import java.util.Scanner;
class Program19{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the number of star :");
 
 int star =sc.nextInt();
 System.out.println("Enter the number :");
 
  int n = sc.nextInt();
  for(int i=1;i<=n;i++){
   for(int j=1;j<=star;j++){
   System.out.print("* ");
   }
   star--;
   System.out.println();
   }
  }
 } 
