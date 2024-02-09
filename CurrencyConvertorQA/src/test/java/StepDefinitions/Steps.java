package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.fail;

public class Steps {
    WebDriver driver;

    @Given("I am present at the currency exchange portal")
    public void i_am_on_the_currency_conversion_website() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true); // Allow navigation to insecure (HTTP) pages
        driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        driver.get("http://localhost:8081");
        Thread.sleep(2000);
    }
    @When("I fill in {string} in the amount field")
    public void i_enter_in_the_amount_field(String amount) throws InterruptedException {
        WebElement amountTextFiled = driver.findElement(By.id("amount"));
        amountTextFiled.sendKeys(amount);
        Thread.sleep(2000);
    }
    @When("I choose {string} as the from currency")
    public void i_select_as_the_source_currency(String fromCurrency) throws InterruptedException {
        WebElement fromBox = driver.findElement(By.id("from"));
        fromBox.click();
        fromBox.sendKeys(fromCurrency);
        Thread.sleep(2000);
    }
    @When("I choose {string} as the destination currency")
    public void i_select_as_the_target_currency(String toCurrency) throws InterruptedException {
        WebElement toBox = driver.findElement(By.id("to"));
        toBox.click();
        toBox.sendKeys(toCurrency);
        Thread.sleep(2000);
    }
    @When("I initiate the conversion process")
    public void i_click_the_convert_button() throws InterruptedException {
        WebElement Convertbtn = driver.findElement(By.id("convert-btn"));
        Convertbtn.click();
        Thread.sleep(2000);
    }
    @Then("the converted value {string} should be displayed")
    public void i_should_see_the_converted_amount_displayed(String expectedResult) throws InterruptedException {
            WebElement resultElement = driver.findElement(By.id("result"));
            String actualResult = resultElement.getAttribute("value");
            Assertions.assertEquals(expectedResult, actualResult, "Pass");
    }
    @Then("the exchange rate {string} should be visible")
    public void i_should_see_the_conversion_rate_displayed(String expectedRate) throws InterruptedException {
        WebElement textRate = driver.findElement(By.xpath("//*[@id=\"rate\"]"));
        String actualRate = textRate.getAttribute("value");
        Assertions.assertEquals(expectedRate, actualRate, "Pass");
        Thread.sleep(2000);
    }

    @Then("I should exit the website")
    public void iShouldQuitTheWebsite() {
        driver.quit();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
