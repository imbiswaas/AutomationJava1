package AssignmentAutomation;

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

public class TitleVerify {

    WebDriver wd;

    @Before
    public void Setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        //wd =new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        wd = new ChromeDriver(options);
        wd.manage().window().maximize();
        wd.navigate().to("https://www.automationpractice.com/index.php?");
    }

    @Test
    public void TitleVerify() throws InterruptedException {
        String actualTitle = wd.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals("My Store", actualTitle);

        Thread.sleep(3000);
        wd.quit();
    }
}
//    @After
//    public void ExitOperations(){wd.quit();}
//}


