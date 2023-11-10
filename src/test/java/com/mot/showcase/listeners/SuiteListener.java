package com.mot.showcase.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListener implements ISuiteListener {

  @Override
  public void onStart(ISuite suite) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ushur\\code\\chromedriver.exe");
  }
}
