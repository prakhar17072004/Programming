class AlternateElement
{
  public static  void alternateElement(int [] a)
  {
    for(int i=0 ;i<a.length; i=i+2)
    {
      System.out.print(a[i] + "  ");
      
     }
     System.out.println();
     
    }
   
   public static void main(String[] arg)
   {
     int [] a={12,23,34,45,56,67,78};
     alternateElement(a);
   }
   
  }      
