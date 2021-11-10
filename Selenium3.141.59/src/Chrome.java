import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Chrome {
    @Test
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\tabner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

     //driver.close();
     //driver.quit();
//wait
     //explicit



     //Implicit
      // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //driver.quit();

        //div[@class='login_logo']
        WebElement logo= driver.findElementByClassName("login_logo");
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(logo));

        //driver.findElementByXPath(//div[@class='login_logo']);

        WebElement Username=driver.findElement(By.id("user-name"));
        Username.sendKeys("standard_user");

        WebElement Password=driver.findElementByXPath("//div[@id='login_button_container']/div/form/div[2]/input");
        Password.sendKeys("secret_sauce");

        WebElement LOGIN= driver.findElementByName("login-button");
        LOGIN.click();
    }
}
