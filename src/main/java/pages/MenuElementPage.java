package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuElementPage {
    private WebDriver driver;
    public MenuElementPage(WebDriver driver){
        this.driver = driver;
    }
    public int countElements(){
        List<WebElement> elements = driver.findElements(By.tagName("li"));
        return elements.size();
    }
}
