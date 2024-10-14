class Program13
{ 

  public static void main(String[] arg)
  {
    int x= 1;  int y=10;  int z=100;
    int i = --x +  y++ - z-- - --z + ++y - --x + y-- - --x;
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(i);
    
  }
}    
