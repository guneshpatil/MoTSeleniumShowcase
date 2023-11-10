package com.mot.showcase;

import com.mot.showcase.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDriverUniversityTests {

  WebDriver webDriver = DriverUtils.getWebDriver();

  @BeforeClass
  public void beforeClass(){
    System.out.println("[Before Class] Current Thread: " + Thread.currentThread().getName());
    webDriver = DriverUtils.getWebDriver();
  }

  @BeforeMethod
  public void beforeMethod(){
    System.out.println("[Before Class] Current Thread: " + Thread.currentThread().getName());
  }

  @Test
  public void buttonClickTest(){
    System.out.println("Current Thread: " + Thread.currentThread().getName());
    System.out.println("This is button click test.");
    webDriver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
  }

  @Test
  public void toDoListTest(){
    System.out.println("Current Thread: " + Thread.currentThread().getName());
    System.out.println("This is ToDo List test.");
    webDriver.get("https://webdriveruniversity.com/To-Do-List/index.html");
  }

  @Test
  public void optionSelectTest(){
    System.out.println("Current Thread: " + Thread.currentThread().getName());
    System.out.println("This is Dropdown Menu(s), Checkboxe(s) & Radio Button(s) test.");
    webDriver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
  }

}
