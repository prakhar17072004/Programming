class DifferenceLargestAndSmallest{
 public static void main(String[] args){
  int [] p = {12,34,45,23,56,67,89,80,90,99};
  differenceLargAndSmall(p);
  
  }
  
  
public static void differenceLargAndSmall(int [] a){
 int larg=a[0];
 int small=a[0];
 int diff=0;
   for(int i=0;i<a.length;i++){
    if(a[i]>larg){
     larg=a[i];
     }
    else if(a[i]<small){
     small=a[i];
     }
   }
   
   System.out.println("Largest no. is :" + larg);
   System.out.println("Smallest no. is :" +small);
   diff=larg-small;
   System.out.println("Difference of element is : "+ diff);
  }
  
 } 
    
