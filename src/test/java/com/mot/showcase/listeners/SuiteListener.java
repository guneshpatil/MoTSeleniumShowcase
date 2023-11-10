package com.mot.showcase.listeners;

import com.mot.showcase.utils.DriverUtils;
import java.util.Map.Entry;
import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListener implements ISuiteListener {

  @Override
  public void onStart(ISuite suite) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ushur\\code\\chromedriver.exe");
  }

  @Override
  public void onFinish(ISuite suite) {
    for (Entry<String, WebDriver> entry : DriverUtils.driverMap.entrySet()) {
      entry.getValue().close();
    }
  }
}
