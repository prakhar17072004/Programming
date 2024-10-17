class SmallestElement
{
  public static void smallestElement(int [] a)
  {  
      int small = a[0];
    for(int i=0; i<a.length;i++)
    {
      if(small>a[i])
      {
        small= a[i];
        
       }
       
     }
     
     System.out.println("The smallest element : " +small);
   }
    public static void main(String[] arg)
    { 
    int [] a = {12,34,45,56,67,68,56,44,57};     
      
      
      smallestElement(a);
      
     }
   } 
