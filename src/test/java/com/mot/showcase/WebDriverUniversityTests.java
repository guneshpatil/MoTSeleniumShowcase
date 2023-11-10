package com.mot.showcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDriverUniversityTests {

  @BeforeClass
  public void beforeClass(){
    System.out.println("[Before Class] Current Thread: " + Thread.currentThread().getName());
  }

  @BeforeMethod
  public void beforeMethod(){
    System.out.println("[Before Class] Current Thread: " + Thread.currentThread().getName());
  }

  @Test
  public void buttonClickTest(){
    System.out.println("Current Thread: " + Thread.currentThread().getName());
    System.out.println("This is button click test.");
  }

  @Test
  public void toDoListTest(){
    System.out.println("Current Thread: " + Thread.currentThread().getName());
    System.out.println("This is ToDo List test.");
  }

  @Test
  public void optionSelectTest(){
    System.out.println("Current Thread: " + Thread.currentThread().getName());
    System.out.println("This is Dropdown Menu(s), Checkboxe(s) & Radio Button(s) test.");
  }

}
