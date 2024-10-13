class FrequencyOfElement9
{
  public static int [] printfreqNonRepeating(int[] a)
  {
    int [] freq = new int [101];
     for(int i=0;i<a.length;i++)
     {
       freq[a[i]]++;
       
     }
      
     for(int i=0;i<freq.length;i++)
     {
    
     
     if(freq[a[i]]==1)
     
     { 
       return a[i];
     
       
      }
      
    }
    
   }
   
   public static void main(String[] arg)
   { 
      int [] a={12,12,23,23,34};
      int [] b= printfreqNonRepeating(a);
      System.out.println(b);
   }
   
  }    
