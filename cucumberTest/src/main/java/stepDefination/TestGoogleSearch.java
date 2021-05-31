package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestGoogleSearch {
	@Given("^Launch chrome browser and enter Url$")
	public void launch_chrome_browser_and_enter_Url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}

	@When("^Google search box is visible$")
	public void google_search_box_is_visible() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Enter search cucumber in search box$")
	public void enter_search_cucumber_in_search_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}



}
