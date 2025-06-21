import java.util.Scanner;
class Program20{
 public static void main(String args []){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Number ");
  int n = sc.nextInt();
  int star =n; int space=0;
  for(int i=1;i<=n;i++){
   for(int j=1;j<=space;j++ ){
     System.out.print("  ");
   }
   for(int j=1;j<=star;j++){
    System.out.print("* ");
    }
    
   star-- ; space++; 
   System.out.println();
   }
  }
}
  
  
 
