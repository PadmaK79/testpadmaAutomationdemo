package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.textui.TestRunner;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.mipsdemo.base.TestBase;
import com.mipsdemo.pageobject.LoginPage1;
import com.mipsdemo.pageobject.RemindMeLaterPage;

public class LoginStepDefinitionPF extends TestBase{
	
	//WebDriver driver;
		
	RemindMeLaterPage RemindMeLater;
	
	
	@Given("^Launch the browser and navigate to SF login page web \"([^\"]*)\"$")
	public void launch_the_browser_and_navigate_to_SF_login_page_web(String URL) throws InterruptedException {
		driver.get(URL);	
		
	   /*
		//TestBase.initialization();
		
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\padma.kavitha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);

		driver.get("https://meritagehomes--qa.my.salesforce.com");
		driver.manage().window().maximize();
			
		Thread.sleep(10000);*/
	   
	}
	
	@When("^User enters valid Login page details \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enters_valid_Login_page_details(String username, String password) throws Exception {
		LoginPage1 login= new LoginPage1(driver);
		login.setLoginCredentials(username, password);

		/*login.enterUserName(username);
		login.enterPassword(password);
		Thread.sleep(5000);	  */  
	}
	
	@When("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws InterruptedException {
		LoginPage1 login= new LoginPage1(driver);
		login.clicklogin();
	}
	
	@Then("^user clicks remind me later$")
	public void user_clicks_remind_me_later() throws InterruptedException {
	    		
		/*RemindMeLater = new RemindMeLaterPage(driver);
		
		RemindMeLater.RemindMeLaterLink();
	    Thread.sleep(20000);*/
		System.out.println("this is a test");
	}
	
 
}


