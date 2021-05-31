package stepDefination;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestGoogleSearch {
	
	public static WebDriver driver = new ChromeDriver();
	
	@Given("^Launch chrome browser and enter Url$")
	public void launch_chrome_browser_and_enter_Url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}

	@When("^Google search box is visible$")
	public void google_search_box_is_visible() throws Throwable {

		WebElement searchBox = driver.findElement(By.id("q")) ;
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));
		
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(1000))
		.pollingEvery(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class);
		
		fluentWait.until(ExpectedConditions.visibilityOf(searchBox));
		
		
	}

	@Then("^Enter search cucumber in search box$")
	public void enter_search_cucumber_in_search_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}



}
