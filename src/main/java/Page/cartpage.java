package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartpage {
	WebDriver driver;
	
	By yourcartverify=By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By continuework=By.xpath("//*[@id=\"continue-shopping\"]");
	By checkwork=By.xpath("//*[@id=\"checkout\"]");
	By checkout=By.xpath("//*[@id=\"checkout\"]");
	
	
	public cartpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String yourcartverification() {
		return driver.findElement(yourcartverify).getText();
		
	}
	public void continueworkenbales() {
		driver.findElement(continuework).isEnabled();
		
	}
	public void checkworkenables() {
		driver.findElement(checkwork).isEnabled();
	}
	public void checkouting() {
		driver.findElement(checkout).click();
	}

}
