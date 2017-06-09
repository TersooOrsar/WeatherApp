
public class fiboArray{
		
	public static void main(String [] args){
			
		
		int first = 0;
		int second = 1;
		int limit =10;
		int next;
		
		for(int i =0; i<10; i++){
			
			if(i <=1){
				
				next =i;
				
			}else{
				
				next = second + first;//1,2,3,5
				first = second;//1,1,2
				second = next;//1,2,3
				
				
			}
			
			System.out.println(next +"="+ second+"+"+first );
			
		}
		
	}
	
}