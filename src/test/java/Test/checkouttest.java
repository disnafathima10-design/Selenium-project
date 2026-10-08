package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Base.baseclass;

public class checkouttest extends baseclass {
	
	@Test
	public void checkpagetextverification() {
       test=extent.createTest("checkpagetextverification");
		String text= check.textverification();
		Assert.assertEquals(text, "Checkout: Your Information");
	}
	@Test
	public void objectcall() {
		check.setvalue("fathima", "disna", "72892");
		check.clickcontinue();
	}
	
	


}
