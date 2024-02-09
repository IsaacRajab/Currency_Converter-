package com.example.CurrencyConvertorQA;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.TestWatcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.MalformedURLException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class CurrencyApplicationTests implements TestWatcher {
	WebDriver driver;

	@BeforeAll
	static void setUpWeb() {
		WebDriverManager.chromedriver().setup();
	}
	@AfterEach
	void teardown()  {
		if (driver != null) {

			driver.quit();
		}
	}
	@Test
	void GetDtafromDtabase() {
		List<Currency> x;
		x = controller.getCurrencies();
		System.out.println(x);
	}

	@Autowired
	private CurrencyConversionController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

	@Test
	void GetFucntion() {
		assertThat(this.controller.getCurrencies()).isNotNull();
	}


	@Test
	@DisplayName("TestApi")
	void TestApiGetfunction() throws MalformedURLException {
		assertThat(this.controller.convertCurrency(100,"USD","ILS")).isNotNull();
	}
	@Test
	@DisplayName("Testwebsite")
	void TestWebsit() throws MalformedURLException, InterruptedException {
		final String fromCurrency = "united";
		final String fromCode = "USD";
		final String toCurrency = "Israel";
		final String toCode = "ILS";
		final int amount = 100;
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true); // Allow navigation to insecure (HTTP) pages
		driver = new ChromeDriver(options);

		driver.get("http://localhost:8081");
		Thread.sleep(2000); // Wait for 5 seconds

		WebElement amountTextField = driver.findElement(By.id("amount"));
		amountTextField.sendKeys(Integer.toString(amount));
		Thread.sleep(2000); // Wait for 5 seconds

		WebElement fromBox = driver.findElement(By.id("from"));
		fromBox.click();
		Thread.sleep(2000); // Wait for 5 seconds

		fromBox.sendKeys(fromCurrency);
		Thread.sleep(2000); // Wait for 5 seconds

		WebElement toBox = driver.findElement(By.id("to"));
		toBox.click();
		Thread.sleep(2000); // Wait for 5 seconds

		toBox.sendKeys(toCurrency);
		Thread.sleep(2000); // Wait for 5 seconds

		WebElement Convertbtn = driver.findElement(By.id("convert-btn"));
		Convertbtn.click();
		Thread.sleep(2000); // Wait for 5 seconds

		WebElement textResult = driver.findElement(By.id("result"));
		WebElement textRate = driver.findElement(By.xpath("//*[@id='rate']"));

		Thread.sleep(2000); // Wait for 5 seconds

		CurrencyConversionResult Converter = controller.convertCurrency(amount, fromCode, toCode);
		Thread.sleep(2000); // Wait for 5 seconds

		String expectedResult = Double.toString(Converter.getConvertedAmount());
		String expectedRate = Double.toString(Converter.getExchangeRate());
		Thread.sleep(2000); // Wait for 5 seconds

		String actualResult = textResult.getAttribute("value");
		String actualRate = textRate.getAttribute("value");
		Thread.sleep(2000); // Wait for 5 seconds

		Assertions.assertEquals(expectedRate, actualRate, "Pass");
		Assertions.assertEquals(expectedResult, actualResult, "Pass");
		Thread.sleep(2000); // Wait for 5 seconds

	}
}


