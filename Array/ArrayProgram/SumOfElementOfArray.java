class SumOfElementOfArray
{
public static void sumOfElement()
{
int sum=0;
int [] a={12,14,15,16,67,67,68,78,89};
   for(int i=0;i<a.length;i++)
     {

       sum=sum+a[i];
      }
       System.out.println(sum);
  
     }
  
  public  static void main(String[] arg)
  {
  System.out.println("Main starts");
  sumOfElement();
  System.out.println("Main ends");
  }
  }
