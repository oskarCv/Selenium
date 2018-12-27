import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Demo3List {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","Drivers/chrome/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url = "file:///Users/oskarchavez/Documents/OskarCv/Trainings/Selenium/Selenium/CodeSample/WebContent/ListSample.html";
        driver.get(url);

        List <WebElement> elements = driver.findElements(By.tagName("option"));

        Select list = new Select(driver.findElement(By.tagName("select")));
        //elements.get(1).click();
        list.selectByIndex(2);
        System.out.println(list.getOptions().toArray().toString());
        System.out.println("------------------------> S E L E C T E D   O P T I O N <------------------------");
        WebElement element;
        for(int i = 0 ; i< elements.size();i++){
            if(elements.get(i).isSelected()){
                element = elements.get(i);
                System.out.println("< "+ element.getAttribute("value")+" >");
            }
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print(driver.getPageSource());

    }
}
