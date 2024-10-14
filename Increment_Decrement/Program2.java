class Program2
{

 public static void main(String[] arg)
 { 
   int a=11; int b=22; int c;
   c= a + b + a++ + b++ + ++a + ++b;
   System.out.println(a);
   System.out.println(b);
   System.out.println(c);
   }
}   
