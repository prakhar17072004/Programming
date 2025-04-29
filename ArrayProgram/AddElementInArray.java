class AddElementInArray

{

  public static int [] addElement(int [] a, int index ,int values)
  {
    int [] b = new int [a.length+1];
    for(int i=0;i<b.length;i++)
    {  
        if(i<index)
              {
              b[i]=a[i];
         
                }
             else if(i==index)
             {
                b[i]=values;
         
             }  
         else{
                b[i]=a[i-1];
       
               }
       
      
          }
   
     
     return b; 
   }
   
   public static void main(String[] arg)
    {
    
    int [] a={12,23,45,54,67,78,65,67,98}; 
      int [] b =addElement(a,3,34);
      for(int x:b)
      {
      System.out.print(x+"   ");
     
      }
      
      System.out.println(); 
    
    }
    
  }
     
    
    
    
    
      
       
