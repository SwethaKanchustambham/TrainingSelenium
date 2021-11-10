import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumDemo {

public static void main(String[] args){
//open chrome driver
    System.setProperty("webdriver.chrome.driver","C:/Users/tabner/Downloads/chromedriver_win32/chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.saucedemo.com/");

     //closing webbrowser immediatly
    //driver.close(); or driver.quit();
    // wait 2 (implicit(fixed) & explicit(wait until element loaded)

 //implicit
   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    
    WebElement logo=driver.FindElementByClassName("login_logo");
    WebDriverWait wait = new WebDriverWait(driver,30);
    wait.until(ExpectedCondition.visibilityof("logo"));

    WebDriverWait wait = new WebDriverWait(driver,1);
    waitait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//$x("//div[@class='login_logo']")));
   driver.findElementByXpath();

}
}






