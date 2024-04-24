import java.io.*;

		 
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str= "Automation Tester", nstr="";
		        char ch;
		       
		  
		      System.out.println("Automation Tester"); 
		       
		      for (int i=0; i<str.length(); i++)
		      {
		        ch= str.charAt(i); 
		        nstr= ch+nstr;
		      }
		      System.out.println("Reversed word: "+ nstr);
		    }
		

	}

}
