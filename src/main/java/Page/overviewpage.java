package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class overviewpage {
	WebDriver driver;
	By overviewverification=By.xpath("//*[@data-test='secondary-header']/span");
	By cancelenbaleverification=By.id("cancel");
	By finishverification=By.id("finish");
	
	public overviewpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String textverification() {
		return driver.findElement(overviewverification).getText();
	}
	public void cancelation() {
		driver.findElement(cancelenbaleverification);
	}
	public void finishworking() {
		driver.findElement(finishverification).click();
	}

}
