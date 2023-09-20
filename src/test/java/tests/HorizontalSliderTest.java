package tests;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTest extends BaseTest {
    @Test
    public void horizontalsliderTest(){
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderPage();
        horizontalSliderPage.turnSliderright();
       Assert.assertEquals(horizontalSliderPage.getSpanNumber(), "1.5", "Not true number");
    }
}
