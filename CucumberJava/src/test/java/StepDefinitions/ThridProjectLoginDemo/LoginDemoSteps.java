package StepDefinitions.ThridProjectLoginDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
	
	WebDriver driver = null;
	
	@Given("User Open Browser")
	public void user_open_browser() {
		System.out.println("Inside Step - Browser is Open");
		
		// Open the Browser
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : " + projectPath);  
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		   
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("User is on login Page")
	public void user_is_on_login_page() throws InterruptedException {
		System.out.println("Inside Step - User is on login Page");
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(5000);
	    
	}

	@And("User enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		System.out.println("Inside Step - User enters username and password");
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		Thread.sleep(5000);
	    
	}

	@Then("User Click Login")
	public void user_click_login() throws InterruptedException {
		System.out.println("Inside Step - User is Click Login Button");
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(5000);
	    
	}
	
	@And("User is Navigate to the Home Page")
	public void user_is_navigate_to_the_home_page() throws InterruptedException {
		System.out.println("Inside Step - User is Navigate to the Home Page");
		
		driver.getPageSource().contains("Logged In Successfully");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(@class,'wp-block-button__link has-text-color')]")).click();
		
		driver.close();
		driver.quit();
	    
	}
}
