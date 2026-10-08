package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.baseclass;

public class carttest extends baseclass{
	
	
	@Test(priority = 1)
	public void cartyourcartwordverification() {
		test=extent.createTest("cartyourcartwordverification");

		
		String text=cart.yourcartverification();
		Assert.assertEquals(text, "Your Cart");
		
	}
	@Test(priority = 2)
	public void cartcontinueenable() {
		cart.continueworkenbales();
	}
	@Test(priority = 3)
	public void cartcheckoutenable() {
		cart.checkworkenables();
	}
	@Test(priority = 4)
	public void cartcheckouting() {
		cart.checkouting();
	}
	

}
