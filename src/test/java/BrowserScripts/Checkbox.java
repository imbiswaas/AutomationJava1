/* runs */
package BrowserScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkbox {

    WebDriver wd;
    @Before
    public void Setup() {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--disable-notifications");
        //wd =new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        wd=new ChromeDriver(options);
        wd.manage().window().maximize();
        wd.navigate().to("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }
    @Test
    public void Select() throws InterruptedException{
        WebElement chk1=wd.findElement(By.xpath("//input[@id='isAgeSelected']"));
        chk1.click();
        Thread.sleep(5000);
        String msg="Success - Check box is checked";
        String eMsg=wd.findElement(By.xpath("//div[@id='txtAge']")).getText();
        Assert.assertEquals(msg,eMsg);
    }
    @After
    public void ExitOperations(){wd.quit();}

}
