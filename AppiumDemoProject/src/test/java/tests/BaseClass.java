package tests;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() {
		try {
			DesiredCapabilities caps = new DesiredCapabilities();

			// caps.setCapability("platformName", "ANDROID");

			// caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(CapabilityType.VERSION, "");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "");
			caps.setCapability(MobileCapabilityType.UDID, "");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			// caps.setCapability(MobileCapabilityType.APP, "");
			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

			URL url = new URL("https//127.0.0.1:4723/wd/hub");

			driver = new AppiumDriver<MobileElement>(url, caps);
			driver = new AndroidDriver<MobileElement>(url, caps);
//		} catch (Exeception exp) {
//
//			System.out.println("Cause id " + exp.getCause());
//			System.out.println("Message is :" + exp.getMessage());
//			exp.printStackTrace();
//		}
	}
	@Test
	public void sampleTest() {
		System.out.println("Estou dentro do teste");
	}

	@AfterTest
	public void teardown() {

	}
}
