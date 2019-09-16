package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Crawler {
   static WebDriver driver = new Selenium().getDriver();
   
//   static JavascriptExecutor js = (JavascriptExecutor) driver;

   public static void main(String[] args) {
      String url = crawlYanolja();
   }

   public static String crawlYanolja() {
      WebElement wel = null;
      List<WebElement> welList = null;
      String url = "https://www.yanolja.com/hotel";
      driver.get(url);
      wait(1);
     
      //��ü����
      wel = getElementByQuery("#__next > div:nth-child(1) > div.f12kdqor.gqhaWX > main > nav > header > a");
      clicker(wel, 1);
     
      //��������
      wel = getElementByQuery(
            "body > div.ReactModalPortal > div > div > section.f1icdizg > div.scroll-content > div > ul > li:nth-child(2) > a");
      clicker(wel, 1);
     
      //�������� ��ü
      wel = getElementByQuery(
            "body > div.ReactModalPortal > div > div > section.f1icdizg > div.scroll-content > div > ul > li._2W2P-K > div > a:nth-child(1) > span");
      clicker(wel, 3);
      
//      //ȣ������
      // #__next > div:nth-child(1) > div.f12kdqor > section > div:nth-child(2) > div > div.fg4uun.text-place-3013410 > a > div > div.f1m12i7h > div.fdzqypk > h1
      welList = getElementsByQuery("#__next > div:nth-child(1) > div:nth-child(2) > section > div:nth-child(2) > div > div");
   
     
      
      
      for(WebElement v : welList) {
    	  String name = v.findElement(By.cssSelector("a:nth-child(1)")).getAttribute("text");
    	  
    	   System.out.println(name);

//         System.out.println(v.getText());
//         System.out.println("=====");
      }
      driver.close();
      return url;
   }

   public static void wait(int second) {
      for (int i = 0; i < second; i++) {
        
         try {
        	 
            Thread.sleep(1000);
          
         } catch (InterruptedException e) {
            e.printStackTrace();
            
          
         }
      }
      
   } 

   
   public static WebElement getElementByQuery(String query) {
      return driver.findElement(By.cssSelector(query));
   }

   public static List<WebElement> getElementsByQuery(String query) {
      return driver.findElements(By.cssSelector(query));//1
   }

   public static String getString(WebElement wel) {
      return wel.getText();
   }

   public static void clicker(WebElement wel, int second) {
      wel.click();
      wait(second);
   }
}