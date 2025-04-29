class CountEvenElement{
public static void main(String[] args){
  int [] p ={12,23,34,56,78,97,53,46,33};
  countEvenElement(p);
 }
 
public static void countEvenElement(int [] a){
 int count =0;
 for(int i=0;i<a.length;i++){
  if(a[i]%2==0){
  System.out.println("Even element are :"+a[i]);
  count++;
  
  }
 } 
 System.out.println("No.of even element are :"+ count + " Elements");
} 
}

