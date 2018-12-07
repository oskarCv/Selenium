import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session1 {
    public static void main(String args []){
        WebDriver driver;
        //System.setProperty("webdriver.gecko.driver","Drivers/geko/geckodriver");
        System.setProperty("webdriver.chrome.driver","Drivers/chrome/chromedriver");
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();

        driver.get("http://www.google.com");
    }
}
