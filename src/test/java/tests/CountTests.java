package tests;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.MenuElementPage;
import pages.ShiftingContentPage;

import static org.testng.Assert.assertEquals;

public class CountTests extends BaseTest {
    @Test
    public void countSize(){
        ShiftingContentPage shiftingContentPage = homePage.clickShiftingContent();
        MenuElementPage menuElementPage = shiftingContentPage.clickExample1();
        assertEquals(menuElementPage.countElements(), 5, "Not expected");
    }
}
