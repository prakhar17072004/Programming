class EvenElement
{ 
  public static void evenElement(int [] a)
  {
    for(int i=0;i<a.length;i++)
    { 
      if(a[i]%2==0)
      { 
       System.out.println(a[i]);
      }
     } 
     
   }
   
  public static void main(String[] arg)
  {
    int [] a={12,23,34,45,56,67,68};
    evenElement(a);
    
  }
  
}    
   


 
