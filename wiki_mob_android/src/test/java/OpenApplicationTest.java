import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenApplicationTest {
    private AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android" );
        capabilities.setCapability("deviceName", "emu1" );
        capabilities.setCapability("platformVersion", "8.0.0" );
        capabilities.setCapability("automationName", "Appium" );
        capabilities.setCapability("appPackage", "org.wikipedia" );
        capabilities.setCapability("appActivity", ".main.MainActivity" );
        capabilities.setCapability("app", "C:\\Tools\\APK\\org.wikipedia.apk" );
         driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

    @Test
    public void testApplicationStarted(){
        System.out.println("Application opened");

    }

    @AfterClass
    public void tearDown(){
       driver.quit();

    }
}
