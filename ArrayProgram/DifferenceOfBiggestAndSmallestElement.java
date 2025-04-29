class DifferenceOfBiggestAndSmallestElement
  { 
  
  public static void diffOfBigAndSmall()
  {
   int [] a ={12,23,34,66,89,67,78,56,76};
   
   int big=a[0]; int small=a[0];
   
   for(int i=0;i<a.length;i++)
   {
     
     if(big<a[i])
     {
     
     big= a[i];
     
     }
     else if(small>a[i]){
     small=a[i];
     }
     
   }
    int diff=big-small;
    
    System.out.println(diff);
    
    }
    
  public static void main(String[] arg)
  {
  
  System.out.println("Main starts");
  diffOfBigAndSmall();
  System.out.println("Main ends"); 
  }
}
