package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicControlPage;

public class DynamicCOntrolsTest extends BaseTest {
    @Test
    public void dynamicControlsTest(){
        DynamicControlPage dynamicControlPage = homePage.clickDynamicControlsPage();
        dynamicControlPage.clickRemoveButton();
        Assert.assertEquals(dynamicControlPage.getMessage(), "It's gone!", "Wrong message");
    }
}
