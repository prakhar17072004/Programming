class BiggestElement
{
 public static void biggestElement(int [] a)
 {  int big = a[0];
 
   for(int i=0; i<a.length; i++)
   {  
     if(big<a[i])
     {
       big=a[i];
       
      }
     }  
     
     System.out.println("The big is : "+big);
     
   }
   
   public static void main(String[] arg)
   {
    int [] a={12,23,34,45,56,78,89,90,98};
    biggestElement(a);
   
   }
  }   
   
