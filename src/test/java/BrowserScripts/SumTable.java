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

import java.util.List;

public class SumTable {

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
        wd.navigate().to("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
    }
    @Test
    public void sumTable(){
        double sum= 0.00; //Actual, WebElements...
        double expectedSum=90.35;
        List<WebElement> rows= wd.findElements(By.xpath("//*[@id='main']/div[6]/table/tbody/tr/td[6]"));
        for(WebElement row: rows)
        {
            double no = Double.parseDouble(row.getText());
            sum= sum+ no;
        }
        Assert.assertEquals(sum,expectedSum,0.001); //delta is the 2 decimal value
    }
    @After
    public void exit(){wd.quit();}


}
