
import java.util.Scanner;

public class ControlledLoop{
		
	public static void main(String [] args){
			int i;
		Scanner form = new Scanner(System.in);
		System.out.println("Enter start value : ");
		int start = form.nextInt();
		System.out.println("Enter end value : ");
		int end =  form.nextInt();
		if(start < end){
		for(i = start; i<end; i++){
		System.out.println(i);	
			
		}
			
		}else{
			System.out.println("Start should be less than end.");
		}
		
		
		
	}
	
}