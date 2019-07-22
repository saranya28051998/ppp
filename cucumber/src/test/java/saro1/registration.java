package saro1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class registration {
	 public static WebDriver driver;
	  public static WebDriverWait wait;
	
	
	@Given("I want to enter the url of testmeapp")
	public void i_want_to_enter_the_url_of_testmeapp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Arun\\Selenium\\chromedriver.exe");
		   
	    //Create an instance
		driver = new ChromeDriver();
		
		//Navigate to URL
		driver.get("http://192.168.40.4:8083/TestMeApp1/fetchcat.htm#");
		
		//maximize the screen
		driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I click the signup")
	public void i_click_the_signup() {
		driver.findElement(By.partialLinkText("SignUp")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("i enter the username,firstname,lastname")
	public void i_enter_the_username_firstname_lastname() {
		driver.findElement(By.id("userName")).sendKeys("Saroo28");
		driver.findElement(By.id("firstName")).sendKeys("saranya");
		driver.findElement(By.id("lastName")).sendKeys("sivakumar");


		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("i enter the password and confirm password")
	public void i_enter_the_password_and_confirm_password() {
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.id("pass_confirmation")).sendKeys("1234");


		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("i select the gender and contact details")
	public void i_select_the_gender_and_contact_details() {
		driver.findElement(By.xpath(".//input[@value='Male']")).click();
		driver.findElement(By.id("emailAddress")).sendKeys("saro123@gmail.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");


	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("i enter the dob and address")
	public void i_enter_the_dob_and_address() {
		driver.findElement(By.name("dob")).sendKeys("05/28/1998");
		driver.findElement(By.id("address")).sendKeys("Chennai");

	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("i enter the security ques and answer")
	public void i_enter_the_security_ques_and_answer() {
		Select a=new Select(driver.findElement(By.id("securityQuestion")));
		a.selectByVisibleText("What is your favour color?");
		
		driver.findElement(By.id("answer")).sendKeys("Blue");

	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("i click the register button")
	public void i_click_the_register_button() {
		driver.findElement(By.name("Submit")).click();

	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
