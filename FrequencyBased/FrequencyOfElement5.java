class FrequencyOfElement5
{
  public static void printfreqEven(int[] a)
  {
    int [] freq = new int [101];
     for(int i=0;i<a.length;i++)
     {
       freq[a[i]]++;
       
     }
     
     for(int i=0;i<freq.length;i++)
     {
     
     if(freq[i]>0 && freq[i]%2==0 )
     { 
       System.out.println(i+" is: "+freq[i] +" times ");
      }
      
    }
    
   }
   
   public static void main(String[] arg)
   { 
      int [] a={12,12,23,23,34,45,45,56,56,78,67,22,98};
       printfreqEven(a);
   }
   
  }    
