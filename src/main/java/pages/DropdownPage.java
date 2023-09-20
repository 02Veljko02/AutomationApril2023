package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPage {
    private WebDriver driver;
    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }
    public void selectFromDropdown(int index){
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByIndex(index);
    }
    public String getSelectedOption(){
        Select select = new Select(driver.findElement(By.id("dropdown")));
        List<WebElement> selectedOption = select.getAllSelectedOptions();
        return selectedOption.get(0).getText();
    }
}
