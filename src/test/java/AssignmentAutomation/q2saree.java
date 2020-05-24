/*runs* Write an Automation Script to search the Dress code as “Saree”. Verify
there is no record for the Dress with message “0 results have been found” */

package AssignmentAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class q2saree {

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
    public void searchDressCode() throws InterruptedException{
        wd.findElement(By.id("search_query_top")).sendKeys("Saree");
        wd.findElement(By.name("submit_search")).click();

    String expectedText = "No results were found for your search \"Saree\"";
    String actualText = wd.findElement(By.xpath("//*[@id='center_column']/p")).getText();
    System.out.println(actualText);
    Assert.assertEquals(expectedText,actualText);
}
//    @After
//    public void ExitOperations(){wd.quit();}
//}
}
