package homework_week10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class UltimateQA
{
    static String baseUrl = "https://courses.ultimateqa.com/";
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException
    {
       System.setProperty("webdriver.chrome.driver" , "chromedriver.exe");
       driver = new ChromeDriver();                                                               //Setup chrome browser
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.manage().window().maximize();
       driver.get(baseUrl);                                                                     //Open URL
       Thread.sleep(4000);

        System.out.println(driver.getTitle());                                                //Print the title of the page
        System.out.println(driver.getCurrentUrl());                                          //Print the current url
        System.out.println(driver.getPageSource());                                         //Print the page source

        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();                                                               //Click on ‘Sign In’ link
        Thread.sleep(4000);

        System.out.println(driver.getCurrentUrl());                                    //Print the current url

        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("prime1234@gmail.com");                          //Enter the email to email field
        Thread.sleep(4000);

        WebElement pwd = driver.findElement(By.id("user[password]"));              //Enter the password to password field
        pwd.sendKeys("prime123");
        Thread.sleep(4000);

        WebElement signInButton = driver.findElement(By.xpath("(//button[@type='submit'])"));
        signInButton.click();                                                                                    //Click on Login Button
        Thread.sleep(4000);

        driver.navigate().to("https://courses.ultimateqa.com/");                                           //Navigate to baseUrl
        Thread.sleep(4000);

        driver.navigate().forward();                                                                         //Navigate forward to Homepage
        Thread.sleep(4000);

        driver.navigate().back();                                                                          // Navigate back to baseUrl
        Thread.sleep(4000);

        driver.navigate().refresh();                                                                     //Refresh the page
        Thread.sleep(4000);

        driver.quit();                                                                                 //Close the browser.
    }
}
