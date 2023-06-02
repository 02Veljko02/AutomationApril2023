package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {
    private WebDriver driver;
    private By example1 = By.linkText("Example 1: Menu Element");
    public ShiftingContentPage(WebDriver driver){
        this.driver = driver;
    }
    public MenuElementPage clickExample1(){
        driver.findElement(example1).click();
        return new MenuElementPage(driver);
    }

}
