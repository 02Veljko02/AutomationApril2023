package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import utils.DataUtil;

import java.util.HashMap;

import static org.testng.Assert.assertTrue;

public class DataDrivenLoginTests extends BaseTest {
    @Test(dataProviderClass = DataUtil.class, dataProvider = "dataProvider")
    public void testSuccessfullLogin(HashMap<String, String> hashMap){
        LoginPage loginPage = homePage.clickFormsAuthentication();
        loginPage.setUsername(hashMap.get("username"));
        loginPage.setPassword(hashMap.get("password"));
        SecureAreaPage secureAreaPage = loginPage.clickButton();
        Assert.assertTrue(secureAreaPage.getAlertMessage().contains("You logged into a secure area!"),
                "Alert text is wrong.");
    }
    @Test(dataProviderClass = DataUtil.class, dataProvider = "dataProvider2")
    public void testUnccessfullLogin(HashMap<String, String> hashMap){
        LoginPage loginPage = homePage.clickFormsAuthentication();
        loginPage.setUsername(hashMap.get("username"));
        loginPage.setPassword(hashMap.get("password"));
        loginPage.clickButton();
        assertTrue(loginPage.getAlertText().contains("Your username is invalid!"),
                "Login is succssesfull");
    }
    @Test(dataProviderClass = DataUtil.class, dataProvider = "dataProvider3")
        public void testUnccessfullLogin2(HashMap<String, String> hashMap){
        LoginPage loginPage = homePage.clickFormsAuthentication();
        loginPage.setUsername(hashMap.get("username"));
        loginPage.setPassword(hashMap.get("password"));
        loginPage.clickButton();
        Assert.assertTrue(loginPage.getAlertText().contains("Your password is invalid!"),
                "Not expected");
    }
}
