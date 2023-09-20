package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPage {
    private WebDriver driver;
    private By nestedPageLink = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }
    public NestedFramesPage clickNestedFramesPage(){
        driver.findElement(nestedPageLink).click();
        return new NestedFramesPage(driver);
    }
    private void selectedText(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.CONTROL + "a").perform();
    }
    public String getTextFromBottomFrame(){
        var bottomFrame = driver.switchTo().frame("frame-bottom");
        return bottomFrame.getTitle();
    }

}
