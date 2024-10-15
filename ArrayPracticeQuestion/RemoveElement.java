class RemoveElement
{

 public static void removeElement(int[] a , int index)
   {
    int [] b= new int[a.length-1];
    
    for(int i=0;i<b.length; i++)
    {
      if(i<index)
      {
      b[i]= a[i];
      }
      
      else 
      {
       b[i]= a[i+1];
      
      }
      
    } 
    for(int x:b)
    {
    System.out.println(x+" ");
    }
    
  }
  
  public static void main(String[] arg)
  {
     int [] a = {23,34,45,6,67,89};
     removeElement(a,2);
     }
     
 }    
