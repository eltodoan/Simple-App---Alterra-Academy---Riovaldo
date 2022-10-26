package com.example.app.drivers;

import com.example.app.properties.PropertiesReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class DriverInit {

    public static AndroidDriver<AndroidElement> driver;

    public static void initialize() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Pixel 4 XL");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("app", "C:/Users/riova/Downloads/sample-apk.apk");
        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("noReset","true");

        String url = "http://0.0.0.0:4723/wd/hub";
        try {driver = new AndroidDriver<>
                    (new URL(url),caps);}
        catch (MalformedURLException e){ e.printStackTrace();}}



}



