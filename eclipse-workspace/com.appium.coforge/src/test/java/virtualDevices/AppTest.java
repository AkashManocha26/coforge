package virtualDevices;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppTest {
	
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
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Chrome']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("com.android.chrome:id/search_box_text")).sendKeys("amazon");
		Thread.sleep(4000);

	}
}

