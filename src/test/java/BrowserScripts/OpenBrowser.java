package BrowserScripts;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
   private io.github.bonigarcia.wdm.WebDriverManager WebDriverManager;
   @Test
    public void openChromeBrowser() throws InterruptedException {
       WebDriverManager.chromedriver().setup();
       //Create ChromeDriver instance
       WebDriver wd= new ChromeDriver();
       //ChromeDriver wd=new ChromeDriver();
       //Open Browser
       wd.get("http://www.gmail.com");
       //Maximize Browser
       wd.manage().window().maximize();
       //Wait for 5 sec
       Thread.sleep(5000);
       //Close Browser
       wd.quit();
   }



   }
