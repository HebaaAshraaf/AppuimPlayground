package Tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TestMyMobile {
    AndroidDriver driver;

    @BeforeTest
    public void launchingAUT() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();


        caps.setCapability("appuim-version", "1.15.1");
        caps.setCapability("Version", "7.0");
        caps.setCapability("deviceName", "83e54d44435a414e");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "Appium");
        caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        caps.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
        caps.setCapability("orientationg", "PORTRAIT");
        caps.setCapability("noReset", "true");
        caps.setCapability("unlockType", "pin");
        caps.setCapability("unlockKey", "******");


        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
    }

    @Test
    public void runFirstScript() {
        driver.findElementById("bt_02").click();
        driver.findElementById("bt_add").click();
        driver.findElementById("bt_02").click();
        Assert.assertEquals(driver.findElementById("txtCalc_RealTimeResult").getText(),"4");
    }
}
