package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrokenImagesPage {
    private WebDriver driver;
    public BrokenImagesPage(WebDriver driver){
        this.driver = driver;
    }
    public int countImages(){
        List <WebElement> images = driver.findElements(By.tagName("img"));
        return images.size();
    }
}
