package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FramePage {
    private WebDriver driver;
    public FramePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clear(){
        var frame = driver.switchTo().frame("mce_0_ifr");
        frame.findElement(By.id("tinymce")).clear();
        driver.switchTo().defaultContent();
    }
    public void setTextToFrame(String text){
        var frame = driver.switchTo().frame("mce_0_ifr");
        frame.findElement(By.id("tinymce")).sendKeys(text);
        driver.switchTo().defaultContent();
    }
    public void bold(){
        this.selectText();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/button[1]/span")).click();
    }
    private void selectText(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.CONTROL + "a").perform();
    }
    public String getBoldText(){
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div[1]/div")).getText();
    }

}
