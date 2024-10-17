class RotateOnePositionRight
{

public static void rotateRight(int[]a )
{  
   int last= a[a.length-1];
   for(int i= a.length-1;i>0;i--)
      {
         a[i]=a[i-1];
     
     }
     a[0]=last;
   
   for(int x:a)
     {
       System.out.print(x+" ");
   
      }
      System.out.println( );
   
   }
   
   
   public static void main(String[] arg)
   {
     int [] a= {12,34,45,56,57,78};
     rotateRight(a);
     }
     
   }    
   
