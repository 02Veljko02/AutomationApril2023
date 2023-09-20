package pages;

import org.openqa.selenium.*;

import java.util.List;

public class CheckBoxPage {
    private WebDriver driver;

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickCheckboxbyIndexJS(int index) {
      WebElement checkbox = this.findCheckboxbyIndex(index);
      String script = "arguments[0].click()";
      ((JavascriptExecutor)driver).executeScript(script, checkbox);
    }
    public void clickCheckboxbyIndex(int index) {
        WebElement checkbox = this.findCheckboxbyIndex(index);
       checkbox.click();
    }
    public boolean isChecked(int index){
        WebElement selectedCheckbox = this.findCheckboxbyIndex(index);
        return selectedCheckbox.isSelected();
    }
    private WebElement findCheckboxbyIndex(int index){
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        return  checkboxes.get(index);
    }
}
