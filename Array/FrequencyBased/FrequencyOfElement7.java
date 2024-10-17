class FrequencyOfElement7
{
  public static void printfreqMax(int[] a)
  {
    int [] freq = new int [101];
     for(int i=0;i<a.length;i++)
     {
       freq[a[i]]++;
       
     }
      int max=0; int element = a[0];
     for(int i=0;i<freq.length;i++)
     {
    
     
     if(freq[i]>max)
     
     { 
       max = freq[i];
       element =i;
     
       
      }
      
    }
    System.out.println("element  " +element + "  is max time"+ max);
   }
   
   public static void main(String[] arg)
   { 
      int [] a={12,12,23,23,34};
       printfreqMax(a);
   }
   
  }    
