package BrowserScripts;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser2 {
    private io.github.bonigarcia.wdm.WebDriverManager WebDriverManager;
    @Test
    public void openFirefoxBrowser() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        //Create ChromeDriver instance
        WebDriver wd= new FirefoxDriver();
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

//
//WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();