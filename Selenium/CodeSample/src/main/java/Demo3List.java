import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class Demo3List {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","Drivers/chrome/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url = "http://localhost:63342/session1/WebContent/ListSample.html?_ijt=nel20ftubt9ol04ugk2bh4765t";
        driver.get(url);


        List<WebElement> elements = driver.findElements(By.tagName("option"));

        System.out.println("------------------------> S E L E C T E D   O P T I O N <------------------------");
        WebElement element;
        for(int i = 0 ; i< elements.size();i++){
            if(!elements.get(i).isSelected()){
                element = elements.get(i);
                System.out.print("Element "+ element.getAttribute("value"));
            }
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print(driver.getPageSource());

    }
}