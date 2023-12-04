package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	public static WebDriver driver;
	public static void getbrowser()
	{
	    driver = new ChromeDriver();
	 driver.get("http://demowebshop.tricentis.com/");
	}
	public static void login_method() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}
	public static void username()
	{
		driver.findElement(By.id("Email")).sendKeys("Itest@test.com");	
	}
	public static void password()
	{
		driver.findElement(By.id("Password")).sendKeys("Itest@test");	
	}
	
	public static void login_btn()
	{
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	/*public LoginPage()
	{
	PageFactory.initElements(driver, this);
	}
	*/


}



