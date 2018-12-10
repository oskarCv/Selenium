import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3Checks {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","Drivers/chrome/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url = "http://localhost:63342/session1/WebContent/ChecksSample.html?_ijt=a9srfeu9es0j4qbsv9kklm4sl1";
        driver.get(url);


        WebElement element = driver.findElements(By.name("activity")).get(2);
        element.click();
        System.out.println("------------------------> S E L E C T E D   C O L O R <------------------------");
        System.out.println(element.getAttribute("value"));
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print(driver.getPageSource());

    }
}
