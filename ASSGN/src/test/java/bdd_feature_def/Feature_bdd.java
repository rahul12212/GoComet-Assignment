package bdd_feature_def;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Feature_bdd {
	WebDriver driver;
	Alert a;

	@Given("User must be on homepage of the E-commerce website by clicking {string}")
	public void user_must_be_on_homepage_of_the_e_commerce_website_by_clicking(String string) {
		System.getProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(string);
	}

	@When("User should click on signup button.")
	public void user_should_click_on_signup_button() {
		driver.findElement(By.id("signin2")).click();
	}

	@Then("Sign-up dialog box should be displayed.")
	public void sign_up_dialog_box_should_be_displayed() throws InterruptedException {
		Thread.sleep(3500);
		boolean actual = driver.findElement(By.id("signInModalLabel")).isDisplayed();
		Assert.assertEquals(true, actual);
	}

	@When("Enter valid username and password")
	public void enter_valid_username_and_password() throws InterruptedException {
		Thread.sleep(3500);
		driver.findElement(By.id("sign-username")).sendKeys("Rahul12121265");
		driver.findElement(By.id("sign-password")).sendKeys("Rah12121256");
	}

	@When("Click on signup")
	public void click_on_signup() {
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
	}

	@Then("A successful pop-up should be displayed saying {string}")
	public void a_successful_pop_up_should_be_displayed_saying(String string) throws InterruptedException {
		Thread.sleep(3500);
		a = driver.switchTo().alert();
		String expected = string;
		String actual = a.getText();
		Assert.assertEquals(expected, actual);
	}

	@Then("User should click on ok button.")
	public void user_should_click_on_ok_button() {
		a.accept();
	}

	// Additional steps for the new scenarios:

	@When("User clicks on \"Products\" link in the navigation bar.")
	public void user_clicks_on_products_link_in_the_navigation_bar() {
		driver.findElement(By.linkText("Laptops")).click();
	}

	@Then("A list of all products should be displayed.")
	public void a_list_of_all_products_should_be_displayed() {
		Assert.assertTrue(driver.findElement(By.id("Phones")).isDisplayed());
	}

	@When("User clicks on the name of any product")
	public void user_clicks_on_the_name_of_any_product() {
		driver.findElement(By.linkText("Samsung galaxy s6")).click();
	}

	@Then("The product details page should be displayed")
	public void the_product_details_page_should_be_displayed() {
		Assert.assertTrue(driver.findElement(By.id("productModalLabel")).isDisplayed());
	}
}
