class EvenElement

{
   public static boolean giveEvenElement()
{
 int [] a={11,24,33,43,57,67,63}; 
    for(int i=0;i<a.length;i++)
    {
       if(a[i]%2==0)
        {
         return true;
         }
         
         
   
       
    }
     return  false;
 
 }

 
 
 public static void main(String[] arg)
 {
 System.out.println("Main starts");
 if(giveEvenElement())
 {
 
 System.out.println("even no contain the arrary");
 }else{
 System.out.println("Not even"); 
 }
 
 System.out.println("Main ends");
 
 }
 
 
}
 
 
 
 
 
 
 
 
 
