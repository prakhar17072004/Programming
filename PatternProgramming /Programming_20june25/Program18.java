import java.util.Scanner;
class Program18{

 public static void main(String[] args){
   
    Scanner sc= new Scanner(System.in);
    int star=1;
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
     for(int j=1;j<=star;j++){
      System.out.print("* ");
      }
      star++;
      System.out.println();
      }
     } 
     }
