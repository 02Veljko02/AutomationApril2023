package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicControlPage {
    private WebDriver driver;
    private By removeButton = By.cssSelector("button[onclick='swapCheckbox()']");
    private By loader = By.id("loading");

    public DynamicControlPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickRemoveButton(){
        driver.findElement(removeButton).click();
    }
    public String getMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
        return driver.findElement(By.id("message")).getText();
    }
}
