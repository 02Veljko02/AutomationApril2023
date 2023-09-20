package tests;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.DropdownPage;

import static org.testng.Assert.assertEquals;

public class DropdownTests extends BaseTest {
    @Test
    public void testDropdownOptions(){
        DropdownPage dropdownPage = homePage.clickDropdown();
        dropdownPage.selectFromDropdown(1);
        assertEquals(dropdownPage.getSelectedOption(), "Option 1", "Wrong");
    }
}
