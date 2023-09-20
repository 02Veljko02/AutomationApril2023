package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By span = By.tagName("span");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void turnSliderright(){
        driver.findElement(By.cssSelector("input[type='range']")).sendKeys(Keys.ARROW_RIGHT);
        Actions actions = new Actions(driver);
       actions.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).build().perform();
    }
    public String getSpanNumber(){
        return driver.findElement(span).getText();
    }


}
