package bdd_feature_def;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.After;
import java.util.List;
import org.openqa.selenium.WebElement;





import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class ProductListingStepDefinitions {

    private WebDriver driver;

    public ProductListingStepDefinitions() {
        driver = new ChromeDriver();
    }

    @When("User clicks on \"Categories\" link in the navigation bar")
    public void userClicksOnCategoriesLinkInTheNavigationBar() {
        driver.findElement(By.linkText("notebook")).click();
    }

    @Then("A list of all products should be displayed")
    public void aListOfAllProductsShouldBeDisplayed() {
        Assert.assertTrue(driver.findElement(By.id("notebook")).isDisplayed());
    }

    @And("The product name web elements should be available")
    public void theProductNameWebElementsShouldBeAvailable() {
        List<WebElement> productNames = driver.findElements(By.className("Samsung galaxy s7"));
        Assert.assertTrue(productNames.size() > 0);
    }

    @After
    public void closeDriver() {
        driver.close();
    }
}
