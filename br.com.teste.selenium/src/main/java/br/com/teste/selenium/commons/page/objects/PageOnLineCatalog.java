package br.com.teste.selenium.commons.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageOnLineCatalog {

	final WebDriver driver;

	public WebElement findIItemName1Table() {
		return driver.findElement(By
				.xpath("/html/body/table/tbody/tr/td[1]/h1"));
	}

	@FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[2]/td/div/center/table/tbody/tr[2]/td[4]/h1/input")
	public WebElement txtOrderQuantityItem1;

	@FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[2]/td/div/center/table/tbody/tr[3]/td[4]/h1/input")
	public WebElement txtOrderQuantityItem2;

	@FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[2]/td/div/center/table/tbody/tr[4]/td[4]/h1/input")
	public WebElement txtOrderQuantityItem3;

	@FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[2]/td/div/center/table/tbody/tr[5]/td[4]/h1/input")
	public WebElement txtOrderQuantityItem4;

	@FindBy(how = How.NAME, using = "bSubmit")
	public WebElement buttonPlaceAnOrder;

	public PageOnLineCatalog(WebDriver driver) {
		this.driver = driver;
	}

	public void endTest() {
		driver.quit();
	}

}
