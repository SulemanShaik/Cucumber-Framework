package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.NopCommerceLoginPage;

public class Step {

	public WebDriver driver;
	public NopCommerceLoginPage lp;

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		lp = new NopCommerceLoginPage(driver);

	}

	@When("User opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User enters emailid as {string} and password as {string}")
	public void user_enters_emailid_as_and_password_as(String username, String pwd) {
		lp.enterEmail(username);
		lp.enterPassword(pwd);
	}

	@When("Click Login button")
	public void click_Login_button() {
		lp.clickLoginBTN();
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) {
		if (driver.getPageSource().contains("Login was unsuccessful ")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("User click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
		Thread.sleep(3000);
		lp.clickLogout();
		Thread.sleep(3000);
	}

	@Then("Close browser")
	public void close_browser() {
		driver.close();
	}

}
