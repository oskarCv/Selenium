import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3RadioButtons {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","Drivers/chrome/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url = "file:///Users/oskarchavez/Documents/OskarCv/Trainings/Selenium/Selenium/CodeSample/WebContent/ButtonSample.html";
        driver.get(url);


        WebElement element = driver.findElement(By.id("green"));
        element.click();
        System.out.println("------------------------> S E L E C T E D   C O L O R <------------------------");
        System.out.println(element.getAttribute("value"));
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print(driver.getPageSource());

    }
}
