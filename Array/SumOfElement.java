class SumOfElement{
public static void main(String[] args){
 int [] p = {12,34,45,56,67,78,89};
  sumOfElement(p);
  }
  
public static void sumOfElement(int [] a){
int sum= 0;
for(int i=0;i<a.length; i++){
  System.out.println("the elements are :"+ a[i]);
  sum = sum+a[i];
  }
  System.out.println("Sum of element are : " + sum);
 } 
} 

