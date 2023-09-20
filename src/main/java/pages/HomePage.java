package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.net.ssl.HostnameVerifier;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationlink = By.linkText("Form Authentication");
    private By shiftingContentLink = By.linkText("Shifting Content");
    private By dropdownLink = By.linkText("Dropdown");
    private By brokenImagesLink = By.linkText("Broken Images");
    private By checkboxesLink = By.linkText("Checkboxes");
    private By hoversLink = By.linkText("Hovers");
    private By dragAndDropLink = By.linkText("Drag and Drop");
    private By dynamicControlLink = By.linkText("Dynamic Controls");
    private By horizontalSliderLink = By.linkText("Horizontal Slider");
    private By framesLink = By.linkText("Frames");
    private By alertsLink = By.linkText("JavaScript Alerts");
    private By fileUploadLink = By.linkText("File Upload");
    private By iFramesLink = By.linkText("WYSIWYG Editor");

    public HomePage(WebDriver driver) {
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
    public DropdownPage clickDropdown(){
        driver.findElement(dropdownLink).click();
        return new DropdownPage(driver);
    }
    public BrokenImagesPage clickBrokenImages(){
        driver.findElement(brokenImagesLink).click();
        return new BrokenImagesPage(driver);
    }
    public CheckBoxPage clickCheckboxes(){
        driver.findElement(checkboxesLink).click();
        return new CheckBoxPage(driver);
    }
    public HoversPage clickHoverPage(){
        driver.findElement(hoversLink).click();
        return new HoversPage(driver);
    }
    public DragAndDropPage clickDragAndDropPage(){
        driver.findElement(dragAndDropLink).click();
        return new DragAndDropPage(driver);
    }
    public DynamicControlPage clickDynamicControlsPage(){
        driver.findElement(dynamicControlLink).click();
        return new DynamicControlPage(driver);
    }
    public HorizontalSliderPage clickHorizontalSliderPage(){
        driver.findElement(horizontalSliderLink).click();
        return new HorizontalSliderPage(driver);
    }
    public FramesPage clickFramesPage(){
        driver.findElement(framesLink).click();
        return new FramesPage(driver);
    }
    public AlertsPage clickJSAlerts(){
        driver.findElement(alertsLink).click();
        return new AlertsPage(driver);
    }
    public FileUploadPage clickFileUpload(){
        driver.findElement(fileUploadLink).click();
        return new FileUploadPage(driver);
    }
    public FramePage clickFramePage(){
        driver.findElement(iFramesLink).click();
        return new FramePage(driver);
    }
}
