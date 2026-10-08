package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.baseclass;

public class hometest extends baseclass {
	@Test(priority = 1)
	public void hometestproductverification() {
		test=extent.createTest("hometestproductverification");
		String text=home.producttextverification();
		Assert.assertEquals(text, "Products");
	}
	@Test(priority = 2)
	public void homeselect() {
		home.selectprice();
	}
	@Test(priority = 3)
	public void homeaddcart() {
		home.addproduct();
	
	}
	@Test(priority = 4)
	public void homecart() {
		home.addcarts();
	}
	

}
