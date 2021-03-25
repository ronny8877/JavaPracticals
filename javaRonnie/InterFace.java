interface  Demo{
abstract int factorial( int n);

void palindrome( int num);

}






class InterFace{

 public static void main(String [] args){
 
 
TestDemo test =new TestDemo();
 System.out.println("Factorial is  " + test.factorial(5) ) ;
test.palindrome(55);

 
 
 }
 
}//end of main class


 class TestDemo implements Demo{

public  int factorial( int num){
if(num >0)
return num * factorial( num -1);
 else return 1;
} //end of factorial

 public void palindrome(int num){
int r,sum=0,temp;    
  int n=num;
  
  temp=n;    
  while(n>0){    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println( temp + " is a Palindrome number ");    
  else    
   System.out.println(temp + " is not a palindrome");    
   
   

} //end of palindrome




}//end of test demo


