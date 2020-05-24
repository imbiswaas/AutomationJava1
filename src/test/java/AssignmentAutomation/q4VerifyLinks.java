package AssignmentAutomation;/* Verify My Account Footer section has Links using an Array String */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q4VerifyLinks {

    WebDriver wd;
    @Before
    public void Setup()
    {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();

        wd=new ChromeDriver(options);
        wd.manage().window().maximize();
        wd.navigate().to("https://www.automationpractice.com/index.php?");
    }
    @Test
    public void VerifyLinks() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,2600)");
        Thread.sleep(5000);
        List<String> eAccountLinks = new ArrayList<>
                (Arrays.asList("My orders", "My credit slips", "My addresses", "My personal info"));
        List<String> aAccountLinks = new ArrayList<>();
        List<WebElement> elements = wd.findElements(By.xpath("//*[@id='footer']/div/section/div/ul/li/a"));
        for (WebElement links : elements)
        {
            System.out.println(links.getText());
            aAccountLinks.add(links.getText());
        }
        Assert.assertEquals(eAccountLinks,aAccountLinks);

        Thread.sleep(3000);
    }
    @After
    public void ExitOperations(){wd.quit();}
}