class InsertElement
{

  
 public static void insertElement(int [] a ,int index, int  value)
 { 
    int [] b = new int[a.length+1];
 
   for(int i=0 ;i<b.length;i++)
   {
    if(i<index)
    {
      b[i]=a[i];
      
     }
     else if(i==index)
       {  
       
        b[i]= value;
      
      
       }
      else
        {
         b[i]=a[i-1];
        }
      
      }
   
   for(int x:b)
    {
      System.out.println(x+ " ");
     }
  }
  public static void main(String[] arg)
  {
  
   int [] a={12,23,34,56,56};
   insertElement(a,2,67);
   }
 }  
    
