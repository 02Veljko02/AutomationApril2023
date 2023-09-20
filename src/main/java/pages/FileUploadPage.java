package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By uploadButton = By.className("button");
    private By chooseButton = By.id("file-upload");
    private By uploadedText = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    public void inputPathIntoChooseButton(String path){
        driver.findElement(chooseButton).sendKeys(path);
    }
    public String getPathText(){
        return driver.findElement(uploadedText).getText();
    }
}
