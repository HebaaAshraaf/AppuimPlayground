package Tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestMobWebApp {
    AndroidDriver driver;

    @BeforeTest
    public void launchingAUT() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();


        caps.setCapability("appuim-version", "1.15.1");
        caps.setCapability("Version", "7.0");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "Appium");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
        caps.setCapability("orientationg", "PORTRAIT");
        caps.setCapability("noReset", "true");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
    }

    @Test
    public void runFirstScript() {
        driver.findElementById("digit_2").click();
        driver.findElementById("op_add").click();
        driver.findElementById("digit_2").click();
        Assert.assertEquals(driver.findElementById("result").getText(),"4");
    }
}
