package BrowserScripts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillogin {
    private io.github.bonigarcia.wdm.WebDriverManager WebDriverManager;
    @Test
    public void openChromeBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //Create ChromeDriver instance
        WebDriver wd= new ChromeDriver();
        //Open Browser
        wd.get("http://www.gmail.com");
        //Maximize Browser
        wd.manage().window().maximize();
        //Wait for 5 sec
        Thread.sleep(1000);

        String email="testingamerica1@gmail.com";
        WebElement emailTextField=wd.findElement(By.id("identifierId"));
        emailTextField.sendKeys(email);

       // String password="Testing1";
        WebElement nextbuttonTextField=wd.findElement(By.id("identifierNext"));
        nextbuttonTextField.click();



        wd.findElement(By.xpath("//*[@id=\'identifierNext\']/span"));
        Thread.sleep(1000);



        //Close Browser
        wd.quit();
    }



}
/* wrong password warning */
//wd.findElement(By.xpath("//span[text()='Wrong password. Try again or click Forgot password to reset it.']"))


/* gmail valid login by suman */
//WebDriverManager.chromedriver().setup();
//        WebDriver wd = new ChromeDriver();
//        wd.get("http://www.gmail.com");
//        wd.manage().window().maximize();
//        Thread.sleep(5000);
//        wd.findElement(By.cssSelector("#identifierId")).sendKeys("qatesting00567@gmail.com");
//        Thread.sleep(1000);
//        wd.findElement(By.cssSelector(".RveJvd.snByac")).click();
//        Thread.sleep(10000);
//        wd.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).sendKeys("test234");
//        Thread.sleep(10000);
//        wd.findElement(By.xpath("//*[@id=\'passwordNext\']/span/span")).click();
//        Thread.sleep(10000);
//        String expectedInbox="Wrong password. Try again or click Forgot password to reset it.";
//        WebElement elementInbox=wd.findElement(By.xpath("//span[text()='Wrong password. Try again or click Forgot password to reset it.']"));
//        Assert.assertEquals(expectedInbox,elementInbox.getText());


/* gmail login with invalid password roshni */
//String Password = "Invalidpassword";
//    WebElement JPasswordField = wd.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input"));
//        JPasswordField.sendKeys(Password);
//                wd.findElement(By.xpath("//*[@id='passwordNext']/span")).click();
//                Thread.sleep(10000);
//                WebElement errormsg=wd.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span"));
//                String expectedmsg="Wrong password. Try again or click Forgot password to reset it.";
//                Assert.assertEquals(expectedmsg, errormsg.getText());
//                System.out.println(errormsg.getText());
//                Thread.sleep(5000);
////        close browser
//                wd.quit();