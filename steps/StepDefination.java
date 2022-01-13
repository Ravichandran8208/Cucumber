package steps;



import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination extends Bass  {
	
	
	
	
	
	/*@Given("Open the chrome browser")
	public void open_the_chrome_browser() {
	    

	
		WebDriverManager.chromedriver().setup();

	    driver  = new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
	
		

	
		}
	@Given("Load the application url")
	public void load_the_application_url() {
		driver.get("http://leaftaps.com/opentaps/control/login");
		System.out.println(driver.getTitle());
	}*/
	
	

@Given("Enter username as {string}")
public void enter_username_as_demo_sales_manager(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
    
    
}
@Given("Enter the password as {string}")
public void enter_the_password_as_crmsfa(String pass) {
	driver.findElement(By.id("password")).sendKeys(pass);
    
}
@When("Click on login button")
public void click_on_login_button() {
	driver.findElement(By.className("decorativeSubmit")).click();
    
}
@Then("Homepage should be displayed")
public void homepage_should_be_displayed() {
	 driver.findElement(By.linkText("CRM/SFA")).click();
}
	
@But("Error msg should displayed")
public void Errormsg1()
{
	System.out.println("error page");
}


}



		



