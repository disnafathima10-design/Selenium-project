package Test;


import org.testng.annotations.Test;

import Base.baseclass;
import Page.loginpage;

public class logintest extends baseclass  {
	
	@Test
	public void objectcall() {
		test=extent.createTest("objectcall");
		lt.setvalue("standard_user", "secret_sauce");
		lt.loginclick();
	}
	

}
