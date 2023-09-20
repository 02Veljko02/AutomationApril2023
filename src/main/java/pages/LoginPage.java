package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginField = By.tagName("button");
    private By alertText = By.id("flash");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setUsername(String username){
    driver.findElement(usernameField).sendKeys(username);
    }
    public void setPassword(String password){
        WebElement sifra = driver.findElement(passwordField);
        Actions actions = new Actions(driver);
        actions.sendKeys(sifra, password).perform();
    }
    public SecureAreaPage clickButton(){
        WebElement dugme = driver.findElement(loginField);
        Actions actions = new Actions(driver);
        actions.click(dugme).perform();

        return new SecureAreaPage(driver);
    }
    public String getAlertText(){
        return driver.findElement(alertText).getText();
    }
}