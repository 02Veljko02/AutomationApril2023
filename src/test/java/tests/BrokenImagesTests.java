package tests;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.BrokenImagesPage;

import static org.testng.Assert.assertEquals;

public class BrokenImagesTests extends BaseTest {
    @Test
    public void countBrokenImages(){
        BrokenImagesPage brokenImagesPage = homePage.clickBrokenImages();
        assertEquals(brokenImagesPage.countImages(), 4, "Not expected");
    }
}
