import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3TableXpath {
    public static void main (String args[]){
        System.setProperty("webdriver.chrome.driver","Drivers/chrome/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url = "http://localhost:63342/session1/WebContent/TableSample.html?_ijt=k80atm0ognludc7c89ieo2kfpe";
        driver.get(url);


        WebElement element = driver.findElement(By.xpath("//table[@name = 'table2']//td/a"));
        element.click();
        System.out.println("------------------------> S E L E C T E D <------------------------");
        System.out.println("Tag of HTML Node: "+element.getTagName());
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print(driver.getPageSource());
    }
}
