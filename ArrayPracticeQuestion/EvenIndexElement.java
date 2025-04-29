class EvenIndexElement

{ 
  public static void evenIndexElement(int[] a)
  {  
    for(int i=0 ;i<a.length;i++)
    {
      if(i%2==0)
      {
       System.out.print(a[i]+ " ");
      }
      
    } 
    System.out.println();
    
   }
   
     
   public static void main(String[] arg)
   { 
     int [] a={12,13,24,45,56,67,78};
     evenIndexElement(a);
     
     }
     
  }   
