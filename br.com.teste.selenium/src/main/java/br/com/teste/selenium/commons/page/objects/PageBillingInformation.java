package br.com.teste.selenium.commons.page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageBillingInformation {

	final WebDriver driver;

	@FindBy(how = How.NAME, using = "billName")
	public WebElement txtBillName;

	@FindBy(how = How.NAME, using = "billAddress")
	public WebElement txtBillAddress;

	@FindBy(how = How.NAME, using = "billCity")
	public WebElement txtBillCity;

	@FindBy(how = How.NAME, using = "billState")
	public WebElement txtBillState;

	@FindBy(how = How.NAME, using = "billZipCode")
	public WebElement txBilltZip;

	@FindBy(how = How.NAME, using = "billPhone")
	public WebElement txtBillPhone;

	@FindBy(how = How.NAME, using = "billEmail")
	public WebElement txtBillEmail;

	@FindBy(how = How.NAME, using = "CardType")
	public WebElement comboCard;

	@FindBy(how = How.NAME, using = "CardNumber")
	public WebElement txtCardNumber;

	@FindBy(how = How.NAME, using = "CardDate")
	public WebElement txtExpiration;

	@FindBy(how = How.NAME, using = "shipSameAsBill")
	public WebElement checkboxShipToSameAsBillTo;
	
	@FindBy(how = How.NAME, using = "bSubmit")
	public WebElement buttonPlaceTheOrder;
	
	
	public PageBillingInformation(WebDriver driver) {
		this.driver = driver;
	}

	public void endTest() {
		driver.quit();
	}

	// Credit Card (Option)
    public void ClickTipoCartao(String nome) throws InterruptedException {
    	WebElement select = driver.findElement(By.name("CardType"));
        List<WebElement> options = select.findElements(By.tagName("option"));
        for (WebElement option : options) {
        if (nome.equals(option.getText().trim()))
           option.click();
        }
    }
	
}
