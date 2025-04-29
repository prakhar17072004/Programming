class SumOfOddElement{
public static void main(String[] args){
 int [] p = {12,34,45,56,67,78,89};
  sumOfOddElement(p);
  }
  
public static void sumOfOddElement(int [] a){
int sum= 0;
for(int i=0;i<a.length; i++){
 if(a[i]%2!=0){
  System.out.println("the elements are :"+ a[i]);
  sum = sum+a[i];
    }
   } 
  System.out.println("Sum of odd element are : " + sum);
 } 
} 
