package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragAndDropTest extends BaseTest {
    @Test
    public void dragAndDropTest(){
        DragAndDropPage dragAndDropPage = homePage.clickDragAndDropPage();
        dragAndDropPage.dragAndDrop(0,1);
        Assert.assertEquals(dragAndDropPage.getText(1), "A", "Not expected");
    }
}
