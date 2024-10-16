class RotateElement2TimesOnRight
{
 public static void rotateElement(int [] a, int n)
 {
   
   for(int i=0 ;i<n;i++)
   {
   
     int last = a[a.length-1];
     for(int j=a.length-1;j>0;j--)
     {
      a[j]=a[j-1];
      
     }
     
     a[0]= last;
     
     }
     
    for(int x:a)
    { 
     System.out.println(x+" ");
     }
     
   }
   public static void main(String[] arg)
   { 
    int [] a= {12,34,45,56,78,89,78};
    rotateElement(a,4);
    }    
  }
