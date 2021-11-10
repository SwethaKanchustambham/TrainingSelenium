import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","C:\\Users\\tabner\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        EdgeDriver driver=new EdgeDriver();

        driver.get("https://www.saucedemo.com/");
        WebElement Username=driver.findElement(By.id("user-name"));
        Username.sendKeys("standard_user");

        WebElement Password=driver.findElementByXPath("//div[@id='login_button_container']/div/form/div[2]/input");
        Password.sendKeys("secret_sauce");

        WebElement LOGIN= driver.findElementByName("login-button");
        LOGIN.click();
    }
}
