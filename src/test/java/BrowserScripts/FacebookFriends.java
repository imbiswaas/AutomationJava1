package BrowserScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookFriends {
    WebDriver wd;
    @Before
    public void Setup()
    {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--disable-notifications");
        //wd =new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        wd=new ChromeDriver(options);
        wd.manage().window().maximize();
        wd.navigate().to("https://www.facebook.com");
    }
    @Test
    public void UserLogin() throws InterruptedException{
        String email="testingamerica1@gmail.com";
        String pwd="Testing1";
        wd.findElement(By.name("email")).sendKeys(email);
        wd.findElement(By.name("pass")).sendKeys(pwd);
        wd.findElement(By.xpath("//input[@value='Log In']")).click();

        int expectedFriendsList=5000;
        Thread.sleep(2000);
    }
    @After
    public void ExitOperations(){wd.quit();}
}
