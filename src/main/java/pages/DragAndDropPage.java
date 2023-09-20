package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class DragAndDropPage {
    private WebDriver driver;

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }
    public void dragAndDrop(int sourceIndex, int targetIndex){
        Actions actions = new Actions(driver);
        WebElement source = getDraggableElement(sourceIndex);
        WebElement target = getDraggableElement(targetIndex);
        actions.dragAndDrop(source, target).release();
    }
    private WebElement getDraggableElement(int index){
        List<WebElement> rectangles = driver.findElements(By.className("column"));
        return  rectangles.get(index);
    }
    public String getText(int index){
        WebElement selectedRectangle = getDraggableElement(index);
        return selectedRectangle.getText();
    }
}
