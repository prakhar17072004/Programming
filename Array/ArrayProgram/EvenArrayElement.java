//import java.utils.Scanner;
class  EvenArrayElement{
public static void evenElement()
{
int [] a={10,20,17,19,13};

  for(int i=0; i<a.length ; i++)
{
    if(a[i]%2==0)
       {
      System.out.println(a[i]);
       }
}
}
public static void main(String[] arg)
{
 System.out.println("Main starts ");
 evenElement();
 System.out.println("Main ends");
 
}
}
