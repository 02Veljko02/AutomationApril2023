package stepDefinitions;

import Base.BaseCucumberTest;
import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When; 
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class Steps extends BaseCucumberTest {
    @Before
    @Override
    public void setUp(){
        super.setUp();
    }
    @After
    @Override
    public void tearDown(){
        super.tearDown();
    }
    private LoginPage loginPage;
    private SecureAreaPage secureAreaPage;

   @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        loginPage = homePage.clickFormsAuthentication();
    }
    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
    }
    @When("click submit button")
    public void click_submit_button() {
        secureAreaPage = loginPage.clickButton();
    }
    @Then("the user should see message You logged into a secure area!")
    public void the_user_should_see_message_you_logged_into_a_secure_area() {
        Assert.assertTrue(secureAreaPage.getAlertMessage().contains("You logged into a secure area"),
                "Unsuccessfull login");
    }
    @When("the user enters invalid username and valid password")
    public void the_user_enters_invalid_username_and_valid_password() {
        loginPage.setUsername("123");
        loginPage.setPassword("SuperSecretPassword!");
    }
    @Then("the user should see message Your username is invalid!")
    public void the_user_should_see_message_your_username_is_invalid() {
        assertTrue(loginPage.getAlertText().contains("Your username is invalid"), "Login is succssesfull");
    }



}
