package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoversTests extends BaseTest {
    @Test
    public void HoverTest(){
        HoversPage hoversPage = homePage.clickHoverPage();
        hoversPage.moveToAvatar(2);
        Assert.assertEquals(hoversPage.getTitlefromselectedavatar(2),"name: user3", "Not: user3");
        Assert.assertTrue(hoversPage.getLink(2).endsWith("/users/3"),"Not expected");
    }
}
