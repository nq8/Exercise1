/**
 * 
 */

/**
 * @author Mohsen
 *
 */
import java.io.*;

public class HelloWorld {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you? :)");
		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
		System.out.println("Please enter your name: ");
		try{
	    String eingabe = br.readLine();
	    HelloUser user= new HelloUser(eingabe);
	    user.greetUser();
		
		}
		catch(Exception e){}
		
	}

}
