
import java.util.Scanner;

public class CheckNumber{
	
	/*
	@author joe_pc	
	*/
	
	public static void main(String[] args){
		
		
		Scanner form = new Scanner(System.in);
		
		System.out.println("Enter any number :");
		int yourNumber = form.nextInt();
		
		if(yourNumber % 2 == 0){
			System.out.println("yourNumber is Odd.");
		}else{
			System.out.println("yourNumber is Even.");
		}
		
		
		
	}
	
	
	
}