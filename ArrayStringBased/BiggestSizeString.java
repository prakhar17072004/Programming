class BiggestSizeString

{  

    public static void biggestStringElement(String[] s1)
    {
       
      String big = " ";
      
      for(String p:s1)
      {
          if(big.length()<p.length())
          {
            big = p;
            
          }
       
       
      }     
      System.out.println(big);
        
   }
   
   
 public static void main(String[] arg)
   {
   
   
   String [] s1 = {"Prakhar", "Alok","Anshu","Suryansh"};
   
     biggestStringElement(s1);
     
    }
    
    
  }        
