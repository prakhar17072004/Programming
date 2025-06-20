class Program17{
 public static void main(String args[]){
 int mid= 3;
  for(int i=1;i<=5;i++){
   for(int j=1;j<=5;j++){
    if(i==mid|| j==mid||j==1&&i<mid ||i==1&&j>mid||i==5&&j<mid||j==5&&i>mid){
    System.out.print("*  ");
    }
    else
    {
    System.out.print("   ");
    }
   }
  System.out.println();
  }
 }
}
  
