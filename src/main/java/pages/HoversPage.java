package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoversPage {
    private WebDriver driver;
    private By avatar = By.className("figure");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }
    public void moveToAvatar(int index){
        List<WebElement> selectedAvatar = driver.findElements(avatar);
        WebElement selectedAvatar2 = selectedAvatar.get(index);
        Actions actions = new Actions(driver);
        actions.moveToElement(selectedAvatar2).release();
    }
    public String getLink(int index){
        List<WebElement> selectedAvatar = driver.findElements(avatar);
        WebElement selectedAvatar2 = selectedAvatar.get(index);
        return selectedAvatar2.findElement(By.tagName("a")).getAttribute("href");
    }
    public String getTitlefromselectedavatar(int index){
        List<WebElement> selectedAvatar = driver.findElements(avatar);
        WebElement selectedAvatar2 = selectedAvatar.get(index);
        Actions actions = new Actions(driver);
        actions.moveToElement(selectedAvatar2).release();
        return selectedAvatar2.findElement(By.tagName("h5")).getText();
    }

}
