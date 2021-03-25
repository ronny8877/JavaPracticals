class CommandLine{

public static void main (String [] args) throws ArrayIndexOutOfBoundsException{

int r,sum=0,temp;    
  int n=Integer.parseInt(args[0]);
  
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
   
   
} //end of main 


}//end of class 



