package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.baseclass;


public class overviewtest extends baseclass {
	@Test(priority = 1)
	public void overviewtext() throws Exception {
		Thread.sleep(2000);
	       test=extent.createTest("overviewtext");

		String text=over.textverification();
		System.out.println(text);
		Assert.assertEquals(text,"Checkout: Overview");
	}
	@Test(priority = 2)
	public void overviewcancelenable() {
		over.cancelation();
	}
	@Test(priority = 3)
	public void overviewfinishbutton() {
		over.finishworking();
	}

}
