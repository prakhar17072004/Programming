class ReverseArray
{
public static void reverseArray(int [] a)
{
  for(int i =a.length -1;i>=0 ; i--)
     {
       System.out.print(a[i]+ "  " );
      
    }
     System.out.println();
  }
   

 public static  void main(String[] arg)
 {
 
   int [] a= {12,23,34,45,56,67};
   reverseArray(a);
   
  }
 }  
 
 
