class AverageOfElement{
public static void main(String[] args){
 int [] p = {12,34,45,56,67,78,89};
  averageOfElement(p);
  }
  
public static void averageOfElement(int [] a){
int sum= 0;
float avg=0;
for(int i=0;i<a.length; i++){
  System.out.println("the elements are :"+ a[i]);
  sum = sum+a[i];
  avg=sum/a.length;
  
  }
  System.out.println("Sum of element are : " + sum);
  System.out.println("Avg of element are : " + avg);
 } 
} 
