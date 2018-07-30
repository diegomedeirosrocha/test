package br.com.teste.selenium.commons.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PagePlaceOrder {

	final WebDriver driver;

	public WebElement findButtonWithAnOrder() {
		return driver
				.findElement(By
						.cssSelector("body > form:nth-child(3) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(1) > p:nth-child(1) > input:nth-child(1)"));
	}

	@FindBy(how = How.NAME, using = "bSubmit")
	public WebElement buttonWithAnOrder;

	public PagePlaceOrder(WebDriver driver) {
		this.driver = driver;
	}

	public void endTest() {
		driver.quit();
	}

}
