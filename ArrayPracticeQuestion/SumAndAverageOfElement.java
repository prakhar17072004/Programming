class SumAndAverageOfElement
{

  public static void sumAndAverage(int [] a)
  {
    int sum=0; double avg =0; int count=0;
  for(int i=0;i<a.length;i++)
  { 
    count++;
  
       sum= sum+a[i];
        avg=sum/count;
   
   }
       System.out.println("sum of element is: " +sum);
       System.out.println("Average of element is : " +avg);
  }
  
  public static void main(String[] arg)
  {
  
    int [] a={12,34,45,45,56,67,78,89,90};
    sumAndAverage(a);
    
   }
 }
  
     
