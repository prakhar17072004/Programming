class FrequencyOfElement2
{  
  public static  void printFreqOfOnceOccur(int[] a)
  {  
     int [] freq= new int[101];
     for(int i=0 ;i<a.length;i++)
     {  
       freq[a[i]]++;
     }
     
     
     for(int i=0;i<freq.length;i++)
     {
     
       if(freq[i]==1)
       {
        System.out.println(i + " is : "+freq[i] +" times ");
        
        }
        
        
        
      }
  } 
      
      
  public static void main(String[] arg)
  { 
    int [] a={12,13,34,23,45,23,13};
    printFreqOfOnceOccur(a);
    
    }
  }
