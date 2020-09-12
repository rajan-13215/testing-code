package listenersdemo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class demotestcases {
	
	
	
	@Test
	public void passed_case() {
		
		Assert.assertEquals(12, 12);
	}
	
	@Test
	public void failed_case() {
		
		Assert.assertEquals(12, 13);
	}
	
	
	@Test(dependsOnMethods="failed_case")
	public void skipped_case() {
		
		Assert.assertTrue(true);
	}

}
