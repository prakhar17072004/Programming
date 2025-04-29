class ThreeDigitNumber{
public static void main(String[] args){
 int [] p ={123,34,45,455,567,43,788,999,1000};
 threeDigitNumber(p);
 
 }
 public static void threeDigitNumber(int [] a){
  int count =0;
  for(int i=0;i<a.length;i++){
   if(a[i]>99&& a[i]<1000){
   System.out.println("Three digits no. are: "+a[i]);
   count++;
    }
   }
   System.out.println("no. of three digit elements are :" + count);
   
  }
 } 
