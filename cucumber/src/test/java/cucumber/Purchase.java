package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Purchase {
	//public static WebDriver driver=new ChromeDriver();
	
	
	//System.setProperty("")
	
	
	@When("I go to All {string}")
	public void i_go_to_All_Categories(String x) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(x);
	}

	@When("I go to Electronics")
	public void i_go_to_Electronics() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Elect");
	}

	@When("click on Headphones and add to cart")
	public void click_on_Headphones_and_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("Payment page appears")
	public void payment_page_appears() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
