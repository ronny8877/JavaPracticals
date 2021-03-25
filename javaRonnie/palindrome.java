import java.io.*;

class palindrome{

public static void main(String [] args) throws Exception{

 FileWriterCustom fwc= new  FileWriterCustom();
fwc.fileWriter();
fwc.palindrome();

}//end of main method

}//end of main class
//File Writer Class
class FileWriterCustom {

void fileWriter()throws Exception{
int i;
PrintWriter out = new PrintWriter( new FileWriter("raw.txt"));

//loop to write 1 to thousand to a file
for(i= 1;i<1000;i++){
out.println(i);
out.flush();
} //end of for loop


}//  end of file writer


void palindrome() throws IOException{
BufferedReader reader = new BufferedReader( new FileReader("raw.txt"));
PrintWriter out1 = new PrintWriter( new FileWriter("output.txt"));

String line = reader.readLine();

out1.println("Printing all the Palindromes");
while(line!=null){

 String reversed = new StringBuilder(line).reverse().toString();
      
      if(line.equals(reversed) ){
      out1.println( line );
      out1.flush();
      }

line = reader.readLine();

} //endof while
reader.close();
}//End of PalindRome



}//end of custom class

