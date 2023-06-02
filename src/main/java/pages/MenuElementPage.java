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
    public long countElements(){
        List<WebElement> elements = driver.findElements(By.xpath("//li"));
        return elements.stream().count();
    }
}
