class EvenIndexElementArray
{

public static void  evenIndexElement()

{ 
    int [] a ={13,12,34,45,56,66,67};
      for(int i=0;i<a.length; i++)
      {
      
      if(i%2==0)
      {
      System.out.println(a[i]);
      }
    }  
   }
   
   
   public static void main(String[] arg)
   {
   System.out.println("Main starts");
   evenIndexElement();
   System.out.println("Mains ends");
   }
 }