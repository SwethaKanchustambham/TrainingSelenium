package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    WebDriver driver;

    @Given("^User Navigate to Website$")
    public void openURL(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tabner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }

    @When("^User Enters Valid Username Password$")
    public void LoginSuccess() {

        WebElement logo = driver.findElement(By.className("login_logo"));
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(logo));

        //driver.findElementByXPath(//div[@class='login_logo']);

        WebElement Username = driver.findElement(By.id("user-name"));
        Username.sendKeys("standard_user");

        WebElement Password = driver.findElement(By.xpath("//div[@id='login_button_container']/div/form/div[2]/input"));
        Password.sendKeys("secret_sauce");

        WebElement LOGIN = driver.findElement(By.id("login-button"));
        LOGIN.click();
    }
}
