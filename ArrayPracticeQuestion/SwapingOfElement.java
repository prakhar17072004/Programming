
class SwapingOfElement
{
 
  public static void swapElement(int [] a ,int j,int k)
  {  
  
     for(int i=0; i<a.length;i++)
      {
        System.out.print("Before swaping " +a[i] +"  ");
     
    
   
      int temp = a[j];
      a[j]=a[k];
      a[k]=temp;
      
      
      //System.out.println("After swaping "+ a[i]);
      
     
     }
     
   }
   public static void main(String[] arg)
   { 
    int [] a={12,23,45,56,67,78,89,90};
    swapElement(a,2,5);
    
    }
 }   

