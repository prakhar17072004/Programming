class FrequencyOfElement7
{
  public static void printfreqOdd(int[] a)
  {
    int [] freq = new int [101];
     for(int i=0;i<a.length;i++)
     {
       freq[a[i]]++;
       
     }
     
     for(int i=0;i<freq.length;i++)
     {
     int max=0; int element = a[0];
     
     if(freq[i]>0 && freq[i]%2==1 )
     
     { 
       max = freq[i];
       element =i;
     
       System.out.println("element  " +element + "  is max time"+ max);
      }
      
    }
    
   }
   
   public static void main(String[] arg)
   { 
      int [] a={12,12,23,23,34,45,45,56,56,78,67,22,98};
       printfreqOdd(a);
   }
   
  }    
