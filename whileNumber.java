
import java.util.Scanner;

public class whileNumber{
	
	
	public static void main(String[] args){
		
		
		Scanner form = new Scanner(System.in);
		
		System.out.println("Enter any number :");
		int yourNumber = form.nextInt();
		
		while(yourNumber<18){
			System.out.println("Do you still want to continue: ")
			
			String conditionFactor = form.nextLine();
			if(conditionFactor.equals("no"))
				break;
			System.out.println("You are way too young for this.");
			if(conditionFactor.equals("yes"))
			System.out.println("you may proceed.");
			//yourAge+;

			}
			
			public static int anotherNumber(){
				
				
				
			}
		
		
		
	}
	
	
	
}