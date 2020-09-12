import org.testng.annotations.Test;

public class smallesandlargestnumber {
	
	
	@Test
	public void smallandlargenumber() {
		
		int number[] = {10,20,5,40,50};
		
		int largest = number[0];
		int smallest = number[0];
		
		for (int i = 1; i <number.length; i++) {
			
			if (number[i]>largest) {
				
				largest= number[i];
				
			} else if (number[i]<smallest) {
				
				smallest= number[i];
			}
			
		}
		
		System.out.println(smallest);
		System.out.println(largest);
		
		

}
	
}
