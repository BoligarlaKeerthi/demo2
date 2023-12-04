package stepDefintion;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.LoginPage;

public class LoginStepDefs extends LoginPage {
	
	WebDriver d;
	LoginPage l;
    
	
	@When("user open the url")
	public void user_open_the_url() {
		getbrowser();
		System.out.println(driver.getTitle());
	}

	@Then("click on login")
	public void click_on_login() throws InterruptedException {
	  login_method();
	}

	@Then("give username")
	public void give_username() {
	   username();
	}

	@Then("give password")
	public void give_password() {
	  password();
	   login_btn();
	}
	


}



