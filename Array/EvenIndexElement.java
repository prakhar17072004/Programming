class EvenIndexElement{
 public static void main (String[] args){
  int [] p = {12,3,45,67,23};
  evenIndexElement(p);
 }
 public static void evenIndexElement(int [] a ){
 for(int i=0;i<a.length ;i++){
  if(i%2==0){
   System.out.println(a[i]);
  
  }
  
 } 
 
 }
} 
 
