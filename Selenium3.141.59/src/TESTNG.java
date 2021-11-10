import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TESTNG {
    @Test
    void  LOGIN()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tabner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();

        driver.get("https://www.saucedemo.com/");


        WebElement logo = driver.findElement(By.className("login_logo"));
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(logo));

        //driver.findElementByXPath(//div[@class='login_logo']);

        WebElement Username = driver.findElement(By.id("user-name"));
        Username.sendKeys("standard_user");

        WebElement Password = driver.findElement(By.xpath("//div[@id='login_button_container']/div/form/div[2]/input"));
        Password.sendKeys("secret_sauce");

        WebElement LOGIN = driver.findElement(By.className("login-button"));
        LOGIN.click();
       // driver.quit();
        //LOGIN

    }
    @Test
    void ADDTOCART()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tabner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();

    }
}
