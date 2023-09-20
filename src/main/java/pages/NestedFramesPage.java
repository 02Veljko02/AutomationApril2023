package pages;

import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }
    public String findLeftframe(){
        WebDriver topFrame = driver.switchTo().frame("frame-top");
        WebDriver leftFrame = topFrame.switchTo().frame("frame-left");
        return leftFrame.getTitle();
    }


}
