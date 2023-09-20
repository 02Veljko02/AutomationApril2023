package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import java.io.File;

public class FileUploadTest extends BaseTest {
    @Test
    public void fileUploadTest(){
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.inputPathIntoChooseButton("C:\\Users\\Informatika\\Desktop\\slike\\butik.jpg");
        fileUploadPage.clickUploadButton();
        Assert.assertEquals(fileUploadPage.getPathText(),
                "butik.jpg",
                "Not expected");
    }
}
