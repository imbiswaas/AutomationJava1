//package AssignmentAutomation;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class q5NewsletterVerify {
//
//    WebDriver wd;
//    @Before
//    public void Setup()
//    {
//        ChromeOptions options= new ChromeOptions();
//        WebDriverManager.chromedriver().setup();
//
//        wd=new ChromeDriver(options);
//        wd.manage().window().maximize();
//        wd.navigate().to("https://www.automationpractice.com/index.php?");
//    }
//    @Test
//    public void NewsLetterVerify() throws InterruptedException{
//        JavascriptExecutor js= (JavascriptExecutor) wd;
//        js.executeScript("window.scrollBy(0,2600)");
//                Thread.sleep(5000);
//        wd.findElement(By.id("newsletter-input")).sendKeys(abc123.com);
//        wd.findElement(By.name("submitNewsLetter")).click();
//
//        String msg=wd.findElement(By.xpath(""))
//        String expectedText=""
//
//        Assert.assertEquals(expectedText,actualText);
//
//    }
//    @After
//    public void ExitOperations(){wd.quit();}
//}
////    JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollBy(0,2600)");
////                Thread.sleep(5000);
////                driver.findElement(By.id("newsletter-input")).sendKeys("abc123.com");
////                driver.findElement(By.name("submitNewsletter")).click();
////                String msg = driver.findElement(By.xpath("//*[@id='columns']/p")).getText();
////                System.out.println(msg);
////                Assert.assertEquals("Newsletter : Invalid email address.",msg);
////                Thread.sleep(3000);
////
////                driver.findElement(By.id("newsletter-input")).sendKeys("abc123@gmail.com");
////                driver.findElement(By.name("submitNewsletter")).click();
////                String msg1 = driver.findElement(By.xpath("//*[@id='columns']/p")).getText();
////                System.out.println(msg1);
////                Assert.assertEquals("Newsletter : This email address is already registered.",msg1);
////                Thread.sleep(3000);