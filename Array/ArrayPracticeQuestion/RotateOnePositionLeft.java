class RotateOnePositionLeft
{
 public static void rotateElement(int [] a)
 {
 
  int first_element= a[0];
  for(int i=0;i<a.length-1;i++)
  {
    a[i]=a[i+1];
    
   
   }
   a[a.length-1]=first_element;
   
   for(int x: a)
   { 
    System.out.println(x+" ");
    }
  } 
  
  public static void main(String[] arg)
  {
    int [] a= {12,23,34,45,56,67,78,90};
    rotateElement(a);
    }
   }
