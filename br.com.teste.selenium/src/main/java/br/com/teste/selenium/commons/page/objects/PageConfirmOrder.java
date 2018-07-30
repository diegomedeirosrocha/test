package br.com.teste.selenium.commons.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageConfirmOrder {

	final WebDriver driver;
	
    public WebElement findYourCreditCardWillNotBeCharged(){
    	return driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/table/tbody/tr/td/div/center/table/tbody/tr[2]/td[1]/p"));
    }
	
	public PageConfirmOrder(WebDriver driver) {
		this.driver = driver;
	}

	public void endTest() {
		driver.quit();
	}
	
}
