package br.com.teste.selenium.commons.factory;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebDriverFactory {

	final static Logger log = LoggerFactory.getLogger(WebDriverFactory.class);

	public WebDriver getWebDriver(BrowserEnum browser) {
		WebDriver driver = null;

		String userPath = System.getProperty("user.dir");
		String downloadPath = userPath + File.separator + "Downloads";
		File directory = new File(downloadPath);
		if (!directory.exists()) {
			log.info("Pasta não localizada. Criando...");
			directory.mkdir();
		} else {
			log.info("Pasta localizada!");
		}

		switch (browser) {
		case ChromeLocal:
			HashMap<String, Object> chromePrefes = new HashMap<String, Object>();
			chromePrefes.put("profile.default_content_settings.popups", 0);
			chromePrefes.put("download.default_directory", downloadPath);
			chromePrefes.put("download.prompt_for_download", "true");
			ChromeOptions chromeOptionsLocal = new ChromeOptions();
			chromeOptionsLocal.setExperimentalOption("prefs", chromePrefes);
			chromeOptionsLocal.addArguments("chrome.switches",
					"--disable-extensions");
			chromeOptionsLocal.addArguments("--start-maximized");
			chromeOptionsLocal.addArguments("disable-infobars");
			// chromeOptionsLocal.setHeadless(true);
			System.setProperty("webdriver.chrome.driver",
					"src/main/resources/chromedriver.exe");
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsLocal);
			driver = new ChromeDriver(cap);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			break;
		case FirefoxLocal:
			FirefoxOptions firefoxOptionsLocal = new FirefoxOptions();
			// firefoxOptions.setHeadless(true);
			System.setProperty("webdriver.gecko.driver",
					"src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			break;
		default:
			System.out.println("Browser Invalido!");
			break;
		}
		return driver;
	}
}