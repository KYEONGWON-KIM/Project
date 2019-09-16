package practice.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

   private WebDriver driver;
   public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
   public static final String WEB_DRIVER_PATH = "C:/selenium/chromedriver_win32/chromedriver.exe";

   public Selenium1() {
      System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
      driver = new ChromeDriver();
   }
   
   public WebDriver getDriver() {
      return driver;
   }
}