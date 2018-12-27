import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo4Wait {
    public static void main (String args[]){
        System.setProperty("webdriver.chrome.driver","Drivers/chrome/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "http://www.bing.com";

        driver.get(url);

        WebElement searchElement = driver.findElement(By.className("b_searchbox"));

        searchElement.sendKeys("las locuras del emperador gif");
        searchElement.submit();

        /**
         * implicit wait
         * affects all the request through the DOM
         */
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        /**
         * Explicit wait
         * this just affects the DOM element not all the request
         */
        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Imágenes")));

        WebElement imagesTab = driver.findElement(By.linkText("Imágenes"));
        imagesTab.click();

        WebElement imagelink = driver.findElements(By.cssSelector("a[class = iusc]")).get(1);
        WebElement image = imagelink.findElements(By.tagName("img")).get(0);
        image.click();

        System.out.print(driver.getPageSource().contains("Locuras"));
    }
}
