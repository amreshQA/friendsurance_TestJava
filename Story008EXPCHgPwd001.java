package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Story008EXPCHgPwd001 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://thawing-shelf-73260.herokuapp.com/index.jsp"";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testStory008EXPCHgPwd001() throws Exception {
    driver.get("http://thawing-shelf-73260.herokuapp.com/index.jsp");
    driver.findElement(By.id("login")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show Statistics'])[1]/following::font[2]")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("qwerty");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("newpassword1")).click();
    driver.findElement(By.id("newpassword1")).clear();
    driver.findElement(By.id("newpassword1")).sendKeys("df12@434c");
    driver.findElement(By.id("newpassword2")).click();
    driver.findElement(By.id("newpassword2")).clear();
    driver.findElement(By.id("newpassword2")).sendKeys("df12@434c");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Logout'])[1]/following::div[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Logout'])[1]/following::font[2]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Logout'])[1]/following::font[2]")).getText(), "List Expenses:");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Toggle navigation'])[1]/following::font[2]")).getText(), "Expense tracker");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
