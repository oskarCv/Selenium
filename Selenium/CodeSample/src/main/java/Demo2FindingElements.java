import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FindingElements {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","Drivers/chrome/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "http://www.bing.com";

        driver.get(url);

        WebElement searchElement = driver.findElement(By.name("q"));

        searchElement.sendKeys("las locuras del emperador gif");
        searchElement.submit();

        WebElement imagesTab = driver.findElement(By.linkText("Imágenes"));
        imagesTab.click();

        WebElement imagelink = driver.findElements(By.cssSelector("a[class = iusc]")).get(1);
        WebElement image = imagelink.findElements(By.tagName("img")).get(0);
        image.click();

        System.out.print(driver.getPageSource().contains("Locuras"));
    }
}
