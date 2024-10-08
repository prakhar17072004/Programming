class ArrayStrictlyIncreasing

  {
  
    public static boolean isStrictelyIncreaseing(int[] a)
    {   
    
      for(int i=0;i<a.length-1;i++)
      {
        
        
           if(a[i+1]<a[i])
           {
           
              return false;
              
           }  
           
         }
         return true;
       }
       
       
     public static void main(String[] arg)
     {
     
      int  [] a={12,23,34,45,56,68};
      
      boolean x= isStrictelyIncreaseing(a);
      if(x)
      {
      System.out.println("Strictly increseing");
      }
      else{
      System.out.println("Not increseing");
      }

    }    
      
      
  }
       
         
            
            
