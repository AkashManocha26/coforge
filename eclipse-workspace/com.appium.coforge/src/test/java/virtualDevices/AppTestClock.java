package virtualDevices;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppTestClock {
	
	@Test
	public void verifyDate() throws MalformedURLException, Exception {

		AppiumDriver<MobileElement> driver;
		String appiumserver = "http://localhost:4723/wd/hub";

		//Device
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");		
		caps.setCapability("platformVersion", "34.0");
		
		
		
		driver = new AppiumDriver<MobileElement>(new URL(appiumserver), caps);		
		Thread.sleep(4000);

		
		caps.setCapability("appPackage", "com.google.android.deskclock");
		caps.setCapability("appActivity", "com.android.deskclock.DeskClock");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Add city']")).click();
	}
}

