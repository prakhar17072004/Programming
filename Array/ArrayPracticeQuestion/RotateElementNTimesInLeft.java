class RotateElementNTimesInLeft
{
 public static void rotateElement(int [] a,int n)
 {
   for(int i=0;i<n;i++)
   {
     int first_element= a[0];
     for(int j=0;j<a.length-1;j++)
     {
        a[j]=a[j+1];
    
   
      }
      a[a.length-1]=first_element;
   
      
    }
     for(int x: a)
      { 
        System.out.println(x+" ");
       }
   
  
  } 
  
  public static void main(String[] arg)
  {
    int [] a= {12,23,34,45,56,67,78,90};
    rotateElement(a,3);
    }
   }
