package BrowserScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Panda {

    WebDriver wd;
    @Before
    public void Setup()
    {
        ChromeOptions options= new ChromeOptions();
        //wd =new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        wd=new ChromeDriver(options);
        wd.manage().window().maximize();
        wd.navigate().to("https://www.google.com");
    }
    @Test
    public void Panda() throws InterruptedException{

        String srch="Panda";
        WebElement srchTextField=wd.findElement(By.id("tsf"));
        srchTextField.sendKeys(srch);

        wd.findElement(By.name("srch")).sendKeys(srch);
        wd.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        wd.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
//        String email="testingamerica1@gmail.com";
//        String pwd="Testing1";
//        wd.findElement(By.name("email")).sendKeys(email);
//        wd.findElement(By.name("pass")).sendKeys(pwd);
//        wd.findElement(By.xpath("//input[@value='Log In']")).click();
//
//        int expectedFriendsList=5000;
       // Thread.sleep(2000);
        //List<WebElement> links=wd.findElements(By.cssSelector(".LC20lb.DKV0Md"));
    }
    @After
    public void ExitOperations(){wd.quit();}


}
