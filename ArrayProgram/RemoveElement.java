class RemoveElement
{
 public  static int[]  removeElement(int [] a, int index)
 {
   int [] b = new  int [a.length -1];
   
   for(int i=0;i<b.length;i++)
   {
       if(i<index)
       {
         b[i]=a[i];
         
         }
         else{
         
         
         b[i] =a[i+1];
         }
         
         
         }
         
         return b;
   }      
         public static void main(String[] ags)
         {
           int [] a={12,143,34,45,65,34};
           for(int p:a)
                 System.out.print(p+"   ");
                 System.out.println();
           
           int [] c= removeElement(a,3);
           for(int z:c)
              System.out.print(z+"   ");
               System.out.println();
           
           
           
           
           
           }
           
        }   
