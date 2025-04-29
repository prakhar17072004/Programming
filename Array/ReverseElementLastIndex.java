class ReverseElementLastIndex{
 public static void main(String [] args){
   int [] p = {12,34,45,56,78,59,80};
   
   reverseElement(p);
   }
  
 public static void reverseElement(int [] a){
 
 int temp;
   for(int i=a.length-1;i>=0;i--){
    temp = a[a.length-1];
     a[i] =a[i--];
     a[0]=temp;
    
    System.out.print(a[i] +" ");
    }
   }
  } 
