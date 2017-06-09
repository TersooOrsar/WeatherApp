
import java.util.Scanner;

public class doWhileNumber{
	
	
	
	public static void main(String [] args){
		

			Scanner form = new Scanner(System.in);
			
			System.out.println("Enter any number :");
			
			int yourAge = form.nextInt();
		
		
		
		do{
			yourAge++;
			System.out.println(yourAge);
		}
		while(yourAge < 18)
		
		
	}
	
}