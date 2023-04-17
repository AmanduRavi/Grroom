package Ravi_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class Flipkart_Assignment {
    public static void main(String[] args)throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("ipad");
        Thread.sleep(2000);
        WebElement e2 = driver.findElement(By.xpath("(//span[@class='r85cly'])[2]"));
        Actions actions = new Actions(driver);
        Action builder = actions.moveToElement(e2).click().build();
        builder.perform();
        Thread.sleep(2000);

        Action builder3 = actions.moveByOffset(100, 100).build();
        builder3.perform();
        WebElement selectingresults = driver.findElement(By.xpath("//div[text()='APPLE iPad (10th Gen) 64 GB ROM 10.9 inch with Wi-Fi+5G (Blue)']"));
        selectingresults.click();
        Thread.sleep(2000);
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            if (driver.getTitle().contains("APPLE iPad (10th Gen)")) {
                System.out.println(driver.getTitle());
WebElement enterpincode= driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']"));
Thread.sleep(3000);
enterpincode.sendKeys("500081");
                WebElement checkbutton = driver.findElement(By.xpath("//span[contains(text(),'Check')]"));
                Thread.sleep(2000);
                checkbutton.click();
                Thread.sleep(2000);
        WebElement BuyNowbutton = driver.findElement(By.xpath("//button[@type='button']"));
                BuyNowbutton.click();
                Thread.sleep(2000);
         WebElement EntermobileNumber = driver.findElement(By.xpath("//input[@maxlength='auto']"));
                EntermobileNumber.sendKeys("8019504009");

      WebElement Continuebutton = driver.findElement(By.xpath("//span[text()='CONTINUE']"));
                Continuebutton.click();

            }
        }
    }
}





