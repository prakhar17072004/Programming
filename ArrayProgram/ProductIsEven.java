class ProductIsEven
{


public static boolean evenProduct()
{

 int []a={12,13,14,45,56,67,78};
  for(int x :a)
    {
             if(x%2==0)
                 {
                return true;
    
               }
    
        
     } 
      return false;
}
     public static void main(String[] arg)
      {


    
     
     
        boolean result = evenProduct();
 
          if(result)
              {
              System.out.println("Product is even");
               }
               else{
              System.out.println("Product is not even");
                 }
    }
 
} 
   


