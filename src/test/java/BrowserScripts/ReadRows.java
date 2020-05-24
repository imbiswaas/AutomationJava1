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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadRows {

    WebDriver wd;

    @Before
    public void Setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        //wd =new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        wd = new ChromeDriver(options);
        wd.manage().window().maximize();
        wd.navigate().to("https://www.w3schools.com/html/html_tables.asp");
    }

    @Test
    public void readRows() {
        //print Germany
        WebElement country = wd.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[3]"));
        System.out.println(country.getText());
        //Print all countries
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td[3]")); //no of ..
        for (WebElement row : rows) {
            System.out.println(row.getText());
        }
        //TCs to verify names with 2 arraylist
        List<String> expectedCountries=new ArrayList<String>
                (Arrays.asList("Germany","Mexico","Australia","UK","Canada","Italy"));
        List<String> countries=new ArrayList<>();
        for(WebElement row:rows){
            countries.add(row.getText());
        }
        Assert.assertEquals(countries,expectedCountries);
    }
    @After
    public void exit(){wd.quit();}
}

