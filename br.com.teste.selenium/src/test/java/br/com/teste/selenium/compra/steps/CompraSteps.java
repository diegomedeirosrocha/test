package br.com.teste.selenium.compra.steps;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import br.com.teste.selenium.commons.config.SpringContextConfiguration;
import br.com.teste.selenium.commons.enums.BandeiraCartaoCreditoEnum;
import br.com.teste.selenium.commons.factory.BrowserEnum;
import br.com.teste.selenium.commons.factory.WebDriverFactory;
import br.com.teste.selenium.commons.page.objects.PageBillingInformation;
import br.com.teste.selenium.commons.page.objects.PageOnLineCatalog;
import br.com.teste.selenium.commons.page.objects.PagePlaceOrder;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

@Configuration
@ContextConfiguration(classes = { SpringContextConfiguration.class }, loader = SpringBootContextLoader.class)
public class CompraSteps {

	final static Logger log = LoggerFactory.getLogger(CompraSteps.class);

	private String browser = "ChromeLocal"; // FirefoxLocal //ChromeLocal
	private String site = "http://demo.borland.com/gmopost/online-catalog.htm";

	private PagePlaceOrder pagePlaceOrder;
	private PageOnLineCatalog pageOnLineCatalog;
	private PageBillingInformation pageBillingInformation;

	private WebDriver driver;
	private WebDriverWait driverWait;

	@Dado("^que usuario tenha selecionado os produtos para compra \"([^\"]*)\"$")
	public void queUsuarioTenhaSelecionadoOsProdutosParaCompra(String qtd)
			throws Throwable {

		pageOnLineCatalog.txtOrderQuantityItem1.sendKeys(qtd);
		pageOnLineCatalog.txtOrderQuantityItem2.sendKeys(qtd);
		pageOnLineCatalog.txtOrderQuantityItem3.sendKeys(qtd);
		pageOnLineCatalog.txtOrderQuantityItem4.sendKeys(qtd);

		String pathScreenshot = System.getProperty("user.dir")
				+ "/output/prints/ProdutosSelecionados " + data() + ".png";
		screenshot(driver, pathScreenshot);

		new WebDriverWait(driver, 30).until(ExpectedConditions
				.elementToBeClickable(pageOnLineCatalog.buttonPlaceAnOrder));
		pageOnLineCatalog.buttonPlaceAnOrder.submit();
	}

	@Dado("^exibir tela para confirmar produtosSelecionados$")
	public void exibirTelaParaConfirmarProdutosSelecionados() throws Throwable {

		driverWait.withTimeout(20, TimeUnit.SECONDS).until(
				ExpectedConditions.titleContains("Place Order"));

		new WebDriverWait(driver, 30).until(ExpectedConditions
				.elementToBeClickable(pagePlaceOrder.buttonWithAnOrder));
		pagePlaceOrder.buttonWithAnOrder.submit();

		String pathScreenshot = System.getProperty("user.dir")
				+ "/output/prints/ProdutosSelecionados " + data() + ".png";
		screenshot(driver, pathScreenshot);
	}

	@Quando("^preencher dados de envio cobranca e clicar em PlaceToOrder \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void preencherDadosDeEnvioCobrancaEClicarEmPlaceToOrder(String nome,
			String endereco, String cidade, String uf, String cep,
			String telefone, String email, String bandeira, String nroCartao,
			String codCvc) throws Throwable {

		driverWait.withTimeout(30, TimeUnit.SECONDS).until(
				ExpectedConditions.titleContains("Billing Information"));
		pageBillingInformation.txtBillName.sendKeys(nome);
		pageBillingInformation.txtBillAddress.sendKeys(endereco);
		pageBillingInformation.txtBillCity.sendKeys(cidade);
		pageBillingInformation.txtBillState.sendKeys(uf);
		pageBillingInformation.txBilltZip.sendKeys(cep);
		pageBillingInformation.txtBillPhone.sendKeys(telefone); // "4072704300"
		pageBillingInformation.txtBillEmail.sendKeys(email);

		String bandeiraDescricao = "";
		Assert.assertNotNull(
				"BandeiraCartao nao informada. Favor infomar um desses: MasterCard, Amex, Visa",
				bandeira);
		if (bandeira.equalsIgnoreCase("MasterCard")) {
			bandeiraDescricao = BandeiraCartaoCreditoEnum.MASTERCARD
					.getDescricao();
		} else if (bandeira.equalsIgnoreCase("Amex")) {
			bandeiraDescricao = BandeiraCartaoCreditoEnum.AMEX.getDescricao();
		} else if (bandeira.equalsIgnoreCase("Visa")) {
			bandeiraDescricao = BandeiraCartaoCreditoEnum.VISA.getDescricao();
		} else {
			Assert.fail("BandeiraCartao nao permita, favor infomar um desses: MasterCard, Amex, Visa");
		}

		pageBillingInformation.ClickTipoCartao(bandeiraDescricao);
		pageBillingInformation.txtCardNumber.sendKeys(nroCartao);
		pageBillingInformation.txtExpiration.sendKeys(codCvc);
		if (!pageBillingInformation.checkboxShipToSameAsBillTo.isSelected()) {
			pageBillingInformation.checkboxShipToSameAsBillTo.click();
		}

		String pathScreenshot = System.getProperty("user.dir")
				+ "/output/prints/DadosEnvioECobranca " + data() + ".png";
		screenshot(driver, pathScreenshot);

		new WebDriverWait(driver, 30)
				.until(ExpectedConditions
						.elementToBeClickable(pageBillingInformation.buttonPlaceTheOrder));
		pageBillingInformation.buttonPlaceTheOrder.submit();
	}

	@Entao("^deve exibir tela tela de resumo da compra$")
	public void deveExibirTelaTelaDeResumoDaCompra() throws Throwable {
		driverWait.withTimeout(30, TimeUnit.SECONDS).until(
				ExpectedConditions.titleContains("OnLine Store Receipt"));

		String pathScreenshot = System.getProperty("user.dir")
				+ "/output/prints/resumoCompra " + data() + ".png";
		screenshot(driver, pathScreenshot);
	}

	@Before
	public void setUp() throws InterruptedException {
		log.info("Inicio execucao Setup testes");

		driver = new WebDriverFactory().getWebDriver(BrowserEnum
				.valueOf(browser));
		driver.get(site);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driverWait = new WebDriverWait(driver, 10);

		pageOnLineCatalog = (PageFactory.initElements(driver,
				PageOnLineCatalog.class));
		pagePlaceOrder = (PageFactory
				.initElements(driver, PagePlaceOrder.class));
		pageBillingInformation = (PageFactory.initElements(driver,
				PageBillingInformation.class));

		String pathScreenshot = System.getProperty("user.dir")
				+ "/output/prints/PaginaInicial " + data() + ".png";
		screenshot(driver, pathScreenshot);

		log.info("Fim execucao Setup testes");
	}

	@After
	public void tearDown() throws InterruptedException {
		log.info("Iniciando a execucao do TearDown");

		driver.quit();

		log.info("Fim da execucao do TearDown");
	}

	public static void screenshot(WebDriver driver, String pathArquivo) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(pathArquivo));
			System.out.println("Print gerado");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String data() {
		Date dateTime = new Date();
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		return dt.format(dateTime);
	}

}