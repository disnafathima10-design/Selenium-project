package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutpage {
	WebDriver driver;
	By checkoutverification=By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By firstnameverification=By.id("first-name");
	By lastnameverification=By.id("last-name");
	By postalcodeverification=By.id("postal-code");
	By clickworking=By.id("continue");
	

	public checkoutpage(WebDriver driver) {
		this.driver=driver;
	}



	public String textverification() {
		return driver.findElement(checkoutverification).getText();
	}
	
	public void setvalue(String firstname,String lastname,String postalcode) {
		driver.findElement(firstnameverification).sendKeys(firstname);
		driver.findElement(lastnameverification).sendKeys(lastname);
		driver.findElement(postalcodeverification).sendKeys(postalcode);
	}
	public void clickcontinue() {
		driver.findElement(clickworking).click();
	}

}
