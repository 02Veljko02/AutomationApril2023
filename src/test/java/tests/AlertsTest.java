package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTest extends BaseTest {
    @Test
    public void acceptAlertsTest() {
        AlertsPage alertsPage = homePage.clickJSAlerts();
        alertsPage.clickButtonByIndex(0);
        alertsPage.getAlertText();
        alertsPage.acceptAlert();
        Assert.assertEquals(alertsPage.getResultText(),
                "You successfully clicked an aler",
                "Not expected");
    }

    @Test
    public void declineAlertsTest() {
        AlertsPage alertsPage = homePage.clickJSAlerts();
        alertsPage.clickButtonByIndex(1);
        alertsPage.getAlertText();
        alertsPage.declineAlert();
        Assert.assertEquals(alertsPage.getResultText(),
                "You clicked: Cancel",
                "Not expected text");
    }
}
