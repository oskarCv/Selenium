import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3Checks {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","Drivers/chrome/chromedriver");
        WebDriver driver = new ChromeDriver();

        //String url = "file:///Users/oskarchavez/Documents/OskarCv/Trainings/Selenium/Selenium/CodeSample/WebContent/ChecksSample.html";
        String url = "http://www.google.com";
        driver.get(url);
        //WebElement element = driver.findElements(By.name("activity")).get(0);
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("sdfc");
        element.submit();
        System.out.println("------------------------> S E L E C T E D   C O L O R <------------------------");
        System.out.println(element.getAttribute("value"));
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print(driver.getPageSource());

    }
}
