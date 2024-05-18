package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class amazonSearchSteps {

	WebDriver driver=null;
	@SuppressWarnings("deprecation")
	@Given("Browser is open")
	public void browser_is_open() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webDriver.chrome.driver",projectPath+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		
	}

	@Given("User is on {string} page")
	public void user_is_on_page(String string) {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		driver.get(string);
		driver.manage().window().maximize();
	}

	@When("user enters {string} in search textbox")
	public void user_enters_in_search_textbox(String string) {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(string);
	}

	@When("Click on search button")
	public void click_on_search_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	}

	@Then("Results should display")
	public void results_should_display() {
		// Write code here that  turns the  phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//*[text()='Results']"));
		driver.quit();
	}




}
