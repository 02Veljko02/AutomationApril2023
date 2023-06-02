package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickButton(){
        driver.findElement(loginField).click();
        return new SecureAreaPage(driver);
    }
    public String getAlertText(){
        return driver.findElement(alertText).getText();
    }
}