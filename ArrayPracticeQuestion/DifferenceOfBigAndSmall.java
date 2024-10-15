class DifferenceOfBigAndSmall
{
public static void diffBigAndSmall(int[] a)
{ 
    int big=a[0]; int small =a[0]; int diff;
   for(int i=0;i<a.length ; i++)
   {
     if(big<a[i])
     {
     big=a[i];
     }
     
     if(small>a[i])
     {
     small= a[i];
     }
     
  }
  diff = big-small;
  System.out.println("Biggest no. is :" +big);
     
     System.out.println("smallest no. is :" +small);
     System.out.println("Difference between big and small no. is :" +diff);
     
     
  }
  public static void main(String[] arg) 
  {
    int [] a={12,13,34,45,45,46,67,78};
    diffBigAndSmall(a);
    
    
   } 
  }  

