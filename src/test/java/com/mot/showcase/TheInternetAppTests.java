package com.mot.showcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TheInternetAppTests {

  WebDriver webDriver = null;

  @BeforeClass
  public void getBrowser() {
    System.out.println("[Before Class] Current Thread: " + Thread.currentThread().getName());
    webDriver = new ChromeDriver();
  }

  @BeforeMethod
  public void beforeMethod() {
    System.out.println("[Before Method] Current Thread: " + Thread.currentThread().getName());
  }

  @Test
  public void addRemoveElementTest() {
    System.out.println("Current Thread: " + Thread.currentThread().getName());
    System.out.println("This is Add remove Element test");
    webDriver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    System.out.println("Current url: " + webDriver.getCurrentUrl());
  }

  @Test
  public void dropdownTest() {
    System.out.println("Current Thread: " + Thread.currentThread().getName());
    System.out.println("This is Dropdown test");
    webDriver.get("https://the-internet.herokuapp.com/dropdown");
    System.out.println("Current url: " + webDriver.getCurrentUrl());
  }

  @Test
  public void statusCodeTest() {
    System.out.println("Current Thread: " + Thread.currentThread().getName());
    System.out.println("This is Status Code test");
    webDriver.get("https://the-internet.herokuapp.com/status_codes");
    System.out.println("Current url: " + webDriver.getCurrentUrl());
  }
}
