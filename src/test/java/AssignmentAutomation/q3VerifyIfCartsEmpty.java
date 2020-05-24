package AssignmentAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class q3VerifyIfCartsEmpty {

    WebDriver wd;

    @Before
    public void Setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        //wd =new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        wd = new ChromeDriver(options);
        wd.manage().window().maximize();
        wd.navigate().to("http://automationpractice.com/index.php?");
    }

    @Test
    public void q3VerifyIfCartsEmpty() throws InterruptedException{
        wd.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[5]")).getText();
        String expectedText="Your cart is empty";
        String actualText= wd.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();


        Assert.assertEquals(expectedText,actualText);
    }
//    @After
//    public void ExitOperations(){wd.quit();}
//}
}

