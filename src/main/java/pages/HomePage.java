package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationlink = By.linkText("Form Authentication");
    private By shiftingContentLink = By.linkText("Shifting Content");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public ShiftingContentPage clickShiftingContent(){
      driver.findElement(shiftingContentLink).click();
      return new ShiftingContentPage(driver);
    }
    public LoginPage clickFormsAuthentication(){
        driver.findElement(formAuthenticationlink).click();
        return new LoginPage(driver);
    }
}
