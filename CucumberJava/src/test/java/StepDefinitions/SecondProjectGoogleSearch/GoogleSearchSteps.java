package StepDefinitions.SecondProjectGoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("Browser is Open")
	public void browser_is_open() {
	   System.out.println("Inside Step - Browser is Open");
	   
	   // Open the Browser
	   String projectPath = System.getProperty("user.dir");
	   System.out.println("Project path is : " + projectPath);  
	   System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
	   
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	}

	@When("User is on Google Search Page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step - User is on Google Search Page");
		
		driver.navigate().to("https://google.com");
	}

	@And("User enter a text in Search Box")
	public void user_enter_a_text_in_search_box() throws InterruptedException {
		System.out.println("Inside Step - User enter a text in Search Box");
		
		driver.findElement(By.name("q")).sendKeys("Facebook");
		
		Thread.sleep(5000);
	}

	@Then("User Hits Enter")
	public void user_hits_enter() throws InterruptedException {
		System.out.println("Inside Step - User Hits Enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
	}

	@And("User is Navigate to Search Result")
	public void user_is_navigate_to_search_result() throws InterruptedException {
		System.out.println("Inside Step - User is Navigate to Search Result");
		
		driver.getPageSource().contains("Log In");
		
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
	}
}