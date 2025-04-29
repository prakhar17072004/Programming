class EvenStringElement

  {
  
   public static void evenElement(String [] s1)
   {  
     int count=0;
     
     for(String p:s1)
     {
       if(p.length()%2==0)
       
         {
           System.out.print(p +"   ");
            System.out.print(p.length() +"   ");
           
           count++;
         }
         
      
      
     }
     System.out.println("Total no. of count is s:"+count);
     
   }         
        
    
    
  public static void main(String[] arg)
  
  {
    String [] s1={"Prakhar","Alok","Anshu","Suryansh","Ankur"};
    
    evenElement(s1); 
    
  }
  
 }    
