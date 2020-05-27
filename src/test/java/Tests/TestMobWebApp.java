package Tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestMobWebApp {
    AndroidDriver driver;

    @BeforeTest
    public void launchingAUT() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browserName", "chrome");
        caps.setCapability("appuim-version", "1.17.1");
        caps.setCapability("Version", "7.0");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("platformName", "Android");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    @Test
    public void runFirstScript() {
        driver.get("http://appium.io/");
    }
}
