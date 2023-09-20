package Base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.io.File;
import java.io.IOException;

public class BaseCucumberTest {
    private WebDriver driver;
    public HomePage homePage;
    private File screenshotPath;

    public void setUp(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //driver.get("https://the-internet.herokuapp.com");
        this.goHome();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com");
        homePage = new HomePage(driver);
    }
    public void takeScreenshot(ITestResult result){
        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        screenshotPath = new File("C:\\Users\\Informatika\\IdeaProjects\\AutomationApril2023" +
                "\\src\\main\\resources\\screenshots\\" + result.getName() +".png");
        try {
            Files.move(screenshot, screenshotPath);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    @AfterMethod
    public void inportScreenshotInReport(ITestResult result){
        Reporter.setCurrentTestResult(result);
        if (!result.isSuccess()){
            takeScreenshot(result);
            Reporter.log(result.getName() + " " + "has failed");
            Reporter.log("<a target='_blank' href ='" + screenshotPath +
                    "'height='400' width='400'>Screenshot</a>");
        }
        else if (result.isSuccess()) {
            Reporter.log(result.getName() + "has passed");
        }
        else{
            Reporter.log(result.getName() + "has skipped");
        }
    }

    public void tearDown(){
        driver.quit();
    }
}

