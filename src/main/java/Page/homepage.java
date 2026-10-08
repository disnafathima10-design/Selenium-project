package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class homepage {
	WebDriver driver;
	
	By productstext=By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	
	By filterselect=By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
	
	
	By addallproduct=By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	By addallproduct1=By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
	By addallproduct2=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
	By addallproduct3=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
	By addallproduct4=By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
	By addallproduct5=By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]");
	
	By addcart=By.xpath("//*[@id=\"shopping_cart_container\"]/a");


	public homepage(WebDriver driver) {
		this.driver=driver;
	}
	public String producttextverification() {
		return driver.findElement(productstext).getText();
	}
	public void selectprice() {
		Select s=new Select(driver.findElement(filterselect));
		s.selectByVisibleText("Price (low to high)");
		
	}
	public  void addproduct() {
		driver.findElement(addallproduct).click();
		driver.findElement(addallproduct1).click();
		driver.findElement(addallproduct2).click();
		driver.findElement(addallproduct3).click();
		driver.findElement(addallproduct4).click();
		driver.findElement(addallproduct5).click();
		
		
		
	}
	public void addcarts() {
		driver.findElement(addcart).click();
	}

}
