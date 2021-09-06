package Steps;

import cucumber.api.java.en.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSteps {

	WebDriver driver = null;

	//page object
	//rest assured joão moreira
	
	@Given("^browser is open$")
	public void browser_is_open() throws Throwable {
		System.out.println("dentro do Stap- browser is open");
		System.setProperty("webdriver.chrome.drivver",
				"C:/Users/SempreIT/eclipse-workspace/CumcuberJava/drivers/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@And("^user is on google search page$")
	public void user_is_on_google_search_page() throws Throwable {
		System.out.println("dentro do Stap- user is on google search page");
		
		driver.navigate().to("https://google.com");
	}

	@When("^user enters a test in search box$")
	public void user_enters_a_test_in_search_box() throws Throwable {
		System.out.println("dentro do Stap- user enters a test in search box");
		driver.findElement(By.name("q")).sendKeys("Google");
	}

	@And("^hits enter$")
	public void hits_enter() throws Throwable {
		System.out.println("hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^user is navigated to search results$")
	public void user_is_navigated_to_search_results() throws Throwable {
		System.out.println("user is navigated to search results");
		driver.getPageSource().contains("Google");
		
		driver.close();
		driver.quit();
	}

}
