package com.mot.showcase.utils;

import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
  public static HashMap<String, WebDriver> driverMap = new HashMap<>();

  public synchronized static WebDriver getWebDriver() {
    WebDriver webDriver;
    String threadName = Thread.currentThread().getName();
    if (driverMap == null || !driverMap.containsKey(threadName)) {
      webDriver = new ChromeDriver();
      driverMap.put(threadName, webDriver);
    }
    return driverMap.get(threadName);
  }
}
