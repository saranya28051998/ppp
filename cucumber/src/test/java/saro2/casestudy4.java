package saro2;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy4 {
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
	

	//Provide implicit wait
	//driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	
	//Provide Explicit wait
	//wait = new WebDriverWait(driver,120);

   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
}

@When("I click on signin button")
public void i_click_on_signin_button() {
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	  //Click on Signin
	  driver.findElement(By.linkText("SignIn")).click();
	  

   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
}

@Then("I enter the {string}")
public void i_enter_the1(String username) {
	 driver.findElement(By.id("userName")).sendKeys(username);
   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
}

@Then("i enter the {string}")
public void i_enter_the(String password) {
	 driver.findElement(By.id("password")).sendKeys(password);
   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
}

@Then("i click the Login button")
public void i_click_the_Login_button() {
	 driver.findElement(By.name("Login")).click();
   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
}

@Then("Homepage of testmeapp is displayed")
public void homepage_of_testmeapp_is_displayed() {
	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText("SignOut"))));
	  //System.out.println("Login of testmeapp is sucessful");
	  //driver.close();
	  //Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Home"));
   // Write code here that turns the phrase above into concrete actions
  // throw new cucumber.api.PendingException();
}




@When("user search a particular product like headphones")
public void alex_search_a_particular_product_like_headphones() {
	driver.findElement(By.id("myInput")).sendKeys("Headphone");
	driver.findElement(By.xpath(".//input[@value='FIND DETAILS']")).click();

    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@When("try to proceed without adding item to the cart")
public void try_to_proceed_without_adding_item_to_the_cart() {
	//Assert.assertTrue(driver.findElement(By.xpath(".//a[text()=' Add to cart']")).click());
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	if(driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size()!=0)
			{
		
		driver.findElement(By.cssSelector("i.fa.fa-shopping-cart")).click();
		
	}
	else {
		System.out.println("CART icon not visible");
	}
}

@Then("testmeapp doesnt display the cart icon")
public void testmeapp_doesnt_display_the_cart_icon() {
	driver.close();
	//Assert.assertEquals(message, expected, actual, delta);
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}


}
