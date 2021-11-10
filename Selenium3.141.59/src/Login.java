import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Login {

    WebDriver driver;
    @Parameters({"url"})
    @BeforeTest(groups={"smoke","regression"})
    void openURL(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tabner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

       // driver.get("https://www.saucedemo.com/");
        driver.get(url);
    }
    @Parameters({"Username","Password"})
    @Test(groups = {"smoke","regression"})
    void LoginSuccess(String Username ,String Password) {

        WebElement logo = driver.findElement(By.className("login_logo"));
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(logo));

        //driver.findElementByXPath(//div[@class='login_logo']);

        WebElement Username1 = driver.findElement(By.id("user-name"));
        Username1.sendKeys(Username);

        WebElement Password1 = driver.findElement(By.xpath("//div[@id='login_button_container']/div/form/div[2]/input"));
        Password1.sendKeys(Password);

        WebElement LOGIN = driver.findElement(By.id("login-button"));
        LOGIN.click();
        driver.quit();

    }
    @Test
    void LoginWithOutUserName() {
    

    }
    @Test
    void LoginWithOutPassword() {

    }

    @Test
    void LoginWithWrongUsername(String url){
        driver.get(url);
    }
}