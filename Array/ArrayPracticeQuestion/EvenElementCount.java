class EvenElementCount
{
 public static void  evenElementCount(int [] a)
 {   int count =0;
   for(int i=0;i<a.length;i++)
   { 
     if(a[i]%2==0)
     {
     count++;
     }
   }  
   System.out.println("Total no. of even element is : "+ count);
   
  } 
  
  public static void main(String[] arg)
  {
    int [] a={12,23,34,45,46,56,5,78,80};
    evenElementCount(a);
    
    }
  }  
    
     
      
