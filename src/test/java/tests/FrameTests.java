package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramePage;
import pages.FramesPage;
import pages.NestedFramesPage;

import java.util.HashMap;

public class FrameTests extends BaseTest {
    @Test
    public void frameTest(){
        FramePage framePage = homePage.clickFramePage();
        framePage.clear();
        framePage.setTextToFrame("Veljko");
        framePage.bold();
        Assert.assertEquals(framePage.getBoldText(),
                "P\n" +
                        "»\n" +
                        "STRONG",
                "Not expected");

    }
    @Test
    public void nestedFrameTest(){
        FramesPage framesPage = homePage.clickFramesPage();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesPage();
       Assert.assertEquals(nestedFramesPage.findLeftframe(), "BOTTOM", "Not");
    }
}