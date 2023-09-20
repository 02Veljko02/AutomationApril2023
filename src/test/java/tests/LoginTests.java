package tests;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

public class LoginTests extends BaseTest {
    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage = homePage.clickFormsAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickButton();
        assertTrue(secureAreaPage.getAlertMessage().contains("You logged into a secure area!"),
                "Alert text is wrong.");
    }
    @Test
    public void testUnccessfullLogin(){
        LoginPage loginPage = homePage.clickFormsAuthentication();
        loginPage.setUsername("123");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickButton();
        assertTrue(loginPage.getAlertText().contains("Your username is invalid!"), "Login is succssesfull");
    }
    @Test
    public void testUnccessfullLogin2(){
        LoginPage loginPage = homePage.clickFormsAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword");
        loginPage.clickButton();
        assertTrue(loginPage.getAlertText().contains("Your password is invalid!"), "Login is succssesfull");
    }
}
