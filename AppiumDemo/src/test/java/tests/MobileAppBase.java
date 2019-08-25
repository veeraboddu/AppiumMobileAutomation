package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileAppBase {
		
	// create global variable
	private static AndroidDriver driver;
	
	@BeforeTest
	public void setupMoblieApp() {
		// Create object of DesiredCapabilities class
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// Optional
	/*	capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		// Specify the device name (any name)
		capabilities.setCapability("deviceName", "Pixel 2 API 29");
		// Platform version
		capabilities.setCapability("platformVersion", "9.0.0");
		// platform name
		capabilities.setCapability("platformName", "Android");
	*/	
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 29");
		capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		// specify the application package that we copied from appium
		capabilities.setCapability("appPackage", "io.selendroid.testapp");
		// specify the application activity that we copied from appium
		capabilities.setCapability("appActivity", ".HomeScreenActivity");
		// Start android driver I used 4727 port by default it will be 4723
		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void sampleTest() {
		System.out.println("Sample Mobile App automation test");
	}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
		
	}
	
}
