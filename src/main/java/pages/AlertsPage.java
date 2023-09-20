package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlertsPage {
    private WebDriver driver;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickButtonByIndex(int index){
        List<WebElement> button = driver.findElements(By.tagName("button"));
        button.get(index).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public String getResultText(){
        return driver.findElement(By.id("result")).getText();
    }
    public void declineAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void sendAlertKey(){
        driver.switchTo().alert().sendKeys("Veljko");
    }

}
