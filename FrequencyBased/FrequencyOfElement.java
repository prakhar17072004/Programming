class FrequencyOfElement
{

public static void printFrequency(int[] a)
{ 
   int [] freq = new int [101];
   for(int i=0;i<a.length ;i++)
   {  
     freq[a[i]]++;
     
    }
    
    for(int i=0;i<freq.length ;i++)
     { 
        if(freq[i]>0)
         {
           System.out.println(i +" is :"+freq[i] +"times");
           }
           
         } 
         
         
     }      
     public static void main(String[] arg)
     {
      int [] a= {12,14,12,24,14,39,58,24,12,14};
      printFrequency(a);
      }
      
   }   
