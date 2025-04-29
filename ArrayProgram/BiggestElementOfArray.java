class BiggestElementOfArray
{
  public static void biggestElement()
  {
     
     int [] a={12,13,34,45,56,67,78,98};
     int big =a[0];
     
     for(int i=0;i<a.length;i++)
     {
     if(big<a[i])
     {
     
      big= a[i];
    }
    
    
   
    
    
   }
    System.out.println(big);
   
  }
  public static void main(String[] arg)
  {
   System.out.println("Main starts");
   biggestElement();
   System.out.println("Main ends");
   
   }
   }
  
    
