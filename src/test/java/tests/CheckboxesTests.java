package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

public class CheckboxesTests extends BaseTest {
    @Test
    public void CheckboxesTest(){
        CheckBoxPage checkBoxPage = homePage.clickCheckboxes();
        checkBoxPage.clickCheckboxbyIndexJS(0);
        Assert.assertTrue(checkBoxPage.isChecked(0), "False");

    }
}
