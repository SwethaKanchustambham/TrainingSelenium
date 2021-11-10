package StepDefinition;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    WebDriver driver;

    @Given("^User Navigate to Website$")
    public void openURL(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tabner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }
}
