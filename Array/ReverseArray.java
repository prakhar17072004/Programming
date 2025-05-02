class ReverseArray{
 public static void main(String [] args){
   int [] a= {12,23,34,45,56,67};
   for(int i=0;i<a.length-1;i++){
    int temps = a[i];
    a[i] = a[a.length-1-i];
    a[a.length-1]= temps;
    
    }
    System.out.println("Reverse array");
    for(int i=0;i<a.length;i++){
    System.out.print( a[i] + " \n");
      }
    }
  }
  

  
