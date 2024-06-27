package virtualDevices;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CloudApp {
    
    
    WebDriver driver;
    public static final String USERNAME = "vihaanmahato_hul3u6";
    public static final String AUTOMATE_KEY = "VekpWqgJ4JDJ8jKxH54Q";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    //@Parameters({"browser", "browser_version", "os", "os_version"})
    @BeforeMethod
    public void setUp() throws Exception {

        
        String browserName = "chrome";
        String os = "chrome";
        String os_version = "chrome";
        String browser_version = "chrome";
        
        System.out.println("browser name is : " + browserName);
        //String methodName = name.getName();
        
        DesiredCapabilities caps = new DesiredCapabilities();
        
//      caps.setCapability("os", os);
//      caps.setCapability("os_version", os_version);
//      caps.setCapability("browser_version", browser_version);
        
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 3a");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.SAFARI);
        
        caps.setCapability("build", "xyz chrome browser script");
        caps.setCapability("name", "Coforge ----- Run chrome on device - NOP comm Test on cloud");

        driver = new RemoteWebDriver(new URL(URL), caps);

        
//        =====================================================
//
//        install APK file into browser stack using curl command
//        ------------------------------------------------------
//        execute command on commandPrompt/Terminal
//
//        curl -u "userName:AccessKey"  -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@D:\Jar_files\ApiDemos-debug.apk"
//
//        https://drive.google.com/file/d/1LSrzjiFIikBriyCAUfGmaORbz9mCOk57/view?usp=drive_link
//        
//        curl -u "vihaanmahato_hul3u6:VekpWqgJ4JDJ8jKxH54Q"  -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\Training\Desktop\AWSkeysFolder\ApiDemos-debug.apk"
        // app package and app activity
    }

    
    @Test
    public void LaunchNOPCommApp() throws Exception {
        Thread.sleep(3000);
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("input#Email")).clear();
        driver.findElement(By.cssSelector("input#Email")).sendKeys("admin@yourstore.com");
        
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("admin");
        
        driver.findElement(By.cssSelector("input#RememberMe")).click();
        
        driver.findElement(By.tagName("button")).click();
        
        Thread.sleep(5000);
        
        
    }
    
    
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
    
    
    

}
